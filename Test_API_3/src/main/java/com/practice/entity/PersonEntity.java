package com.practice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class  PersonEntity {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollNum;
	public int getRollNum() {
			return rollNum;
		}
		public void setRollNum(int rollNum) {
			this.rollNum = rollNum;
		}
		public String getFirstname() {
			return firstname;
		}
		public void setFirstname(String firstname) {
			this.firstname = firstname;
		}
		public String getLastname() {
			return lastname;
		}
		public void setLastname(String lastname) {
			this.lastname = lastname;
		}
	private String firstname ;
	private String lastname;
	
}
