package com.Library.Library_Management_System.Controller;

import com.Library.Library_Management_System.Models.Book;
import com.Library.Library_Management_System.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    BookService bookService;

    @PostMapping("/addBook")
    public String addBook(@RequestBody Book book){

        return bookService.addBook(book);
    }
    @GetMapping("/getBook")
    public Book get_Book(@RequestParam("id") int id){
        return bookService.get_Book(id);
    }
    @PutMapping("/putBook")
    public String put_Book(@RequestParam("id") int id, @RequestParam("stdid") int stdid, @RequestParam("quantity") int quantity){
        return bookService.put_Book(id,stdid, quantity);
    }
}
