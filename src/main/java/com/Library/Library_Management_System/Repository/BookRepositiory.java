package com.Library.Library_Management_System.Repository;

import com.Library.Library_Management_System.Models.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepositiory extends JpaRepository<Book, Integer> {
}
