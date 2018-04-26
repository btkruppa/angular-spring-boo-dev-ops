package com.revature.controller.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.entity.FlashCard;

@RestController
@RequestMapping("flashcards")
@CrossOrigin(origins = "http://localhost:4200")
public class FlashCardController {


	@GetMapping
	public List<FlashCard> findAll() {
		List<FlashCard> cards = new ArrayList();
		cards.add(new FlashCard(1, "question 1", "answer"));
		cards.add(new FlashCard(2, "question 2", "answer"));
		cards.add(new FlashCard(3, "question", "answer"));
		return cards;
	}

}
