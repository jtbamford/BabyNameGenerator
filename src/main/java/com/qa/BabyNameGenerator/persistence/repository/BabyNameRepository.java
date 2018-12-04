package com.qa.BabyNameGenerator.persistence.repository;

import org.springframework.stereotype.Repository;

import com.qa.BabyNameGenerator.persistence.domain.BabyName;

@Repository
public class BabyNameRepository implements IBabyNameRepository {
	
	private BabyName name;
	
	public String createBabyName(String nameInput) {
		name = new BabyName();
		name.setName(nameInput);
		return name.getName();
	}

}
