package com.p.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class WeatherEntity {
	@Id
	private String city;
	private double temp;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getTemp() {
		return temp;
	}
	public void setTemp(double temp) {
		this.temp = temp;
	}
}
