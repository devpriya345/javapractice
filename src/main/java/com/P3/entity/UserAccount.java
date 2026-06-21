package com.P3.entity;

import java.time.LocalDate;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserAccount {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer userid;
	
	private String fullname;
	
	private String email;
	
	private Long phno;
	
	private String gender;
	
	private LocalDate dob;
	
	private Integer ssn;
	
	private String activesw ="Y";
	@CreationTimestamp
	private LocalDate createDate;
	
	@UpdateTimestamp
	private LocalDate updateDate;

	@Override
	public String toString() {
		return "UserAccount [userid=" + userid + ", fullname=" + fullname + ", email=" + email + ", phno=" + phno
				+ ", gender=" + gender + ", dob=" + dob + ", ssn=" + ssn + ", activesw=" + activesw + ", createDate="
				+ createDate + ", updateDate=" + updateDate + "]";
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhno() {
		return phno;
	}

	public void setPhno(Long phno) {
		this.phno = phno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public Integer getSsn() {
		return ssn;
	}

	public void setSsn(Integer ssn) {
		this.ssn = ssn;
	}

	public String getActivesw() {
		return activesw;
	}

	public void setActivesw(String activesw) {
		this.activesw = activesw;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}

	public LocalDate getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(LocalDate updateDate) {
		this.updateDate = updateDate;
	}
	
}
