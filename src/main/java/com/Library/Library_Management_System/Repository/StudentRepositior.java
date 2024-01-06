package com.Library.Library_Management_System.Repository;

import com.Library.Library_Management_System.Models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepositior extends JpaRepository<Student, Integer> {
}
