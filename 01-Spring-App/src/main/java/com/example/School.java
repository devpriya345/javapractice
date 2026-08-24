package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class School {
	
	@Autowired
	private Student student; //dependency
	
	public void start() {
		student.study();
	}
}
