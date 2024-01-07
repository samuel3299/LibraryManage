package com.Library.Library_Management_System.Controller;

import com.Library.Library_Management_System.Service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/card")
public class CardController {
    @Autowired
    CardService cardService;
    @PutMapping("/update_card")
    public String updateCard(@RequestParam("id") int id, @RequestParam("name") String name){
        return cardService.updateCard(id,name);
    }
    @PutMapping("/update_cardStatus")
    public String cardsStatus(@RequestParam("id") int id, @RequestParam("cardStatus") String cardStatus){
       return cardService.cardsStatus(id, cardStatus);
    }

}
