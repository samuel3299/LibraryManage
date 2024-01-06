package com.Library.Library_Management_System.Service;

import com.Library.Library_Management_System.Controller.AuthorController;
import com.Library.Library_Management_System.Models.Author;
import com.Library.Library_Management_System.Models.Book;
import com.Library.Library_Management_System.Repository.AuthorRepositiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AuthorService {

    @Autowired
    AuthorRepositiory authorRepositiory;
    public String addAuthor(Author author){
        authorRepositiory.save(author);
        return "Author Added Successfully!";
    }
}
