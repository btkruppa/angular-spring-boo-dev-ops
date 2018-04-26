package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.entity.FlashCard;
import com.revature.repository.FlashCardRepo;

@Service
public class FlashCardServiceImpl implements FlashCardService {

	@Autowired
	private FlashCardRepo flashRepo;

	@Override
	public List<FlashCard> getAll() {
		return flashRepo.findAll();
	}

}
