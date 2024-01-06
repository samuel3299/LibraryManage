package com.Library.Library_Management_System.Models;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(unique = true)
    private String email;
    @CreationTimestamp
    private Date studentCreated;
    @UpdateTimestamp
    private Date updateStudent;

    @OneToOne(mappedBy = "studentVariable",cascade = CascadeType.ALL)
    private Card card;

    public Student() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getStudentCreated() {
        return studentCreated;
    }

    public void setStudentCreated(Date studentCreated) {
        this.studentCreated = studentCreated;
    }

    public Date getUpdateStudent() {
        return updateStudent;
    }

    public void setUpdateStudent(Date updateStudent) {
        this.updateStudent = updateStudent;
    }
    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

}
