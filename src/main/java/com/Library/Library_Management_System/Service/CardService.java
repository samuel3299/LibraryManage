package com.Library.Library_Management_System.Service;

import com.Library.Library_Management_System.Controller.StudentController;
import com.Library.Library_Management_System.Enum.CardStatus;
import com.Library.Library_Management_System.Models.Card;
import com.Library.Library_Management_System.Models.Student;
import com.Library.Library_Management_System.Repository.CardRepository;
import com.Library.Library_Management_System.Repository.StudentRepositior;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    @Autowired
    StudentRepositior studentRepositior;
    @Autowired
    CardRepository cardRepository;
    public String updateCard(int id, String name) {
        Card card = cardRepository.findById(id).get();
        Student student = studentRepositior.findById(id).get();
        if (student.getName().equals(name)){
            card.setName(name);
            cardRepository.save(card);
        return "Updated";
    }
        else return "Entered Wrong Name!";
    }

    public String cardsStatus(int id, String val) {
        Card card = cardRepository.findById(id).get();
        card.setCardStatus(CardStatus.valueOf(val));
        cardRepository.save(card);
        return "updated Card "+val;
    }
}
