package com.Library.Library_Management_System.Service;

import com.Library.Library_Management_System.Models.Author;
import com.Library.Library_Management_System.Models.Book;
import com.Library.Library_Management_System.Models.Card;
import com.Library.Library_Management_System.Repository.AuthorRepositiory;
import com.Library.Library_Management_System.Repository.BookRepositiory;
import com.Library.Library_Management_System.Repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    AuthorRepositiory authorRepositiory;
    @Autowired
    BookRepositiory bookRepositiory;
    @Autowired
    CardRepository cardRepository;

    public String addBook(Book book) {
        try {
            int authorId = book.getAuthor().getId();
            Author author = authorRepositiory.findById(authorId).get();
            book.setAuthor(author);
            List<Book> currBooks = author.getBook();
            currBooks.add(book);
            authorRepositiory.save(author);
            return "Book added Successfully";
        }
        catch(NullPointerException e){
            return "Null pointer";
        }
    }

    public Book get_Book(int id) {
        Book newbook = new Book();
        Book book = bookRepositiory.findById(id).get();
        newbook.setBookStatus(book.getBookStatus());
        newbook.setName(book.getName());
        newbook.setQuantity(book.getQuantity());
        newbook.setRating(newbook.getQuantity());
        return newbook;
    }

    public String put_Book(int id,int stdid, int quantity) {
        Book book = bookRepositiory.findById(id).get();
        if(quantity >book.getQuantity()) return "Book is out of Stock";
        book.setQuantity(book.getQuantity()-quantity);
        Card card = cardRepository.findById(stdid).get();
        book.setCard(card);
        bookRepositiory.save(book);

        return "Book added to Student";
    }
}
