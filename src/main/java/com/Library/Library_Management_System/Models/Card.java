package com.Library.Library_Management_System.Models;

import com.Library.Library_Management_System.Enum.CardStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @CreationTimestamp
    private Date createdCard;
    @UpdateTimestamp
    private Date updatedCard;

    @OneToOne
    @JoinColumn
    private Student studentVariable;
    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;
    public Card() {
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatedCard() {
        return createdCard;
    }

    public void setCreatedCard(Date createdCard) {
        this.createdCard = createdCard;
    }

    public Date getUpdatedCard() {
        return updatedCard;
    }

    public void setUpdatedCard(Date updatedCard) {
        this.updatedCard = updatedCard;
    }
    public Student getStudentVariable() {
        return studentVariable;
    }

    public void setStudentVariable(Student studentVariable) {
        this.studentVariable = studentVariable;
    }

    public CardStatus getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }
}
