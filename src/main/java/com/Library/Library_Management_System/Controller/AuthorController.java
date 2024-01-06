package com.Library.Library_Management_System.Controller;

import com.Library.Library_Management_System.Models.Author;
import com.Library.Library_Management_System.Service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    AuthorService authorService;
    @PostMapping("/addAuthor")
    public String addAuthor(@RequestBody Author author){
        return authorService.addAuthor(author);
    }
}
