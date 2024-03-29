package com.Library.Library_Management_System.Repository;

import com.Library.Library_Management_System.Models.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepositiory extends JpaRepository<Author, Integer> {
}
