package com.Library.Library_Management_System.Service;

import com.Library.Library_Management_System.Enum.CardStatus;
import com.Library.Library_Management_System.Models.Card;
import com.Library.Library_Management_System.Models.Student;
import com.Library.Library_Management_System.Repository.StudentRepositior;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepositior studentRepositior;
    public String addStudent(Student student){
        Card card = new Card();
        card.setCardStatus(CardStatus.Active);
        card.setStudentVariable(student);
        student.setCard(card);
        studentRepositior.save(student);
        return " Student and Card are created!";
    }
}
