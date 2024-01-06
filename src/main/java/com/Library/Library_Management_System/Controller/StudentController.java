package com.Library.Library_Management_System.Controller;

import com.Library.Library_Management_System.Models.Student;
import com.Library.Library_Management_System.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/add_Student")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
}
