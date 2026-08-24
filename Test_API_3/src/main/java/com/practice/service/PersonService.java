package com.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.entity.PersonEntity;
import com.practice.repository.PersonRepository;



@Service
public class PersonService {
	
	@Autowired
	PersonRepository personRepository;
	
	public PersonEntity savePerson() {
		PersonEntity person = new PersonEntity();
		person.setRollNum(5);
		person.setFirstname("Riya");
		person.setLastname("Singh");
		
		return personRepository.save(person);
	}
}





