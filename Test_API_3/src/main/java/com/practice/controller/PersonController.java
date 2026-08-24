package com.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.entity.PersonEntity;
import com.practice.service.PersonService;


@RestController
public class PersonController {
	
	@Autowired
	PersonService personService;
	
	@GetMapping("/person")
	
	public PersonEntity getUser() {
		
		
	return personService.savePerson();
	}
	}
