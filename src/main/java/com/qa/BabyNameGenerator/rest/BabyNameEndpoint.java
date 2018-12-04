package com.qa.BabyNameGenerator.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.BabyNameGenerator.service.IBabyNameService;

@RestController
@CrossOrigin
@RequestMapping("${base_endpoint}")
public class BabyNameEndpoint {
	
	@Autowired
	private IBabyNameService service;
	
	@PostMapping("${create_endpoint}")
	public String createAccountNumber(@PathVariable("length") int length) {
		return service.createBabyName(length);
	}

}
