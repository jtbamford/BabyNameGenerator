package com.qa.BabyNameGenerator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qa.BabyNameGenerator.persistence.repository.IBabyNameRepository;

@Service
public class BabyNameService implements IBabyNameService {
	
	@Autowired
	private IBabyNameRepository repo;
	
	public String createBabyName(int length) {
		
		// put random string generation here
		
		return repo.createBabyName(length);
	}

}
