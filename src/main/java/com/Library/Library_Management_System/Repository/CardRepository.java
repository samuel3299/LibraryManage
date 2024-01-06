package com.Library.Library_Management_System.Repository;

import com.Library.Library_Management_System.Models.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card, Integer> {
}
