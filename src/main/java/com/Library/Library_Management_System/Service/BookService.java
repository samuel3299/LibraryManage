package com.Library.Library_Management_System.Service;

import com.Library.Library_Management_System.Models.Author;
import com.Library.Library_Management_System.Models.Book;
import com.Library.Library_Management_System.Repository.AuthorRepositiory;
import com.Library.Library_Management_System.Repository.BookRepositiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    AuthorRepositiory authorRepositiory;

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
}
