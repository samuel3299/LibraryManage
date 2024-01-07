package com.Library.Library_Management_System.Controller;

import com.Library.Library_Management_System.Models.Student;
import com.Library.Library_Management_System.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;
    @PostMapping("/add_Student")
    public String addStudent(@RequestBody Student student){
        return studentService.addStudent(student);
    }
    @GetMapping("/get_student")
    public Student getStudent(@RequestParam("id") int id){
        Student student = studentService.getStudent(id);
        Student newstudent = new Student();
        newstudent.setPassword(student.getPassword());
        newstudent.setEmail(student.getEmail());
        newstudent.setId(student.getId());
        newstudent.setName(student.getName());
        newstudent.setStudentCreated(student.getStudentCreated());
        newstudent.setUpdateStudent(student.getUpdateStudent());
        return newstudent;
    }
    @PutMapping("/update_student")
    public String updateStudent(@RequestParam("id") int id, @RequestParam("password") String password){
        return studentService.updateStudent(id,password);
    }
    @DeleteMapping("/delete_student")
    public Student deleteStudent(@RequestParam("id") int id){
        Student student = studentService.deleteStudent(id);
        Student newstudent = new Student();
        newstudent.setPassword(student.getPassword());
        newstudent.setEmail(student.getEmail());
        newstudent.setId(student.getId());
        newstudent.setName(student.getName());
        newstudent.setStudentCreated(student.getStudentCreated());
        newstudent.setUpdateStudent(student.getUpdateStudent());
        return newstudent;
    }
}

