package com.p3.service;

import java.util.List;

import com.p3.entity.City;
import com.p3.entity.Country;
import com.p3.entity.State;
import com.p3.entity.User;

public  interface UserService {
	
	List<Country> getCountries();
	
	List<State> getStates(Integer countryId );
	
	List<City> getCities(Integer stateId);
	
	String registerUser(User user);
	
	String login(String email, String password);
	
	String unlockAccount(String email,String tempwd,String newpwd);
	
	String forgotPassword(String email);
	
	
	

}
