package com.Library.Library_Management_System.Models;

import com.Library.Library_Management_System.Enum.CardStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "card")
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @CreationTimestamp
    private Date createdCard;
    @UpdateTimestamp
    private Date updatedCard;

    @OneToOne
    @JoinColumn
    private Student studentVariable;
    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;
    @OneToMany(mappedBy = "card",cascade = CascadeType.ALL)
    List<Book> books;
    public Card() {
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
