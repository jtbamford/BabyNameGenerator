package com.qa.BabyNameGenerator.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.BabyNameGenerator.persistence.repository.IBabyNameRepository;

@Service
public class BabyNameService implements IBabyNameService {
	
	@Autowired
	private IBabyNameRepository repo;
	
	char[] letters = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
	StringBuilder word = new StringBuilder();
	
	public String createBabyName(int length) {	
		Random random = new Random();
		int letterIndex = random.nextInt(25);
		for(int i=0;i<length;i++) {
			word.append(letters[letterIndex]);
		}
		
		return repo.createBabyName(word.toString());
	}

}
