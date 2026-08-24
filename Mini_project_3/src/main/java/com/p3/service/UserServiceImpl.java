package com.p3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.p3.entity.City;
import com.p3.entity.Country;
import com.p3.entity.State;
import com.p3.entity.User;
import com.p3.repo.CityRepo;
import com.p3.repo.CountryRepo;
import com.p3.repo.StateRepo;
import com.p3.repo.UserRepository;
import com.p3.util.PasswordUtil;

@Service
public class UserServiceImpl implements UserService{
	
	
	
	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Autowired
	private CountryRepo countryRepo;
	
	@Autowired
	private StateRepo stateRepo;
	
	@Autowired
	private CityRepo cityRepo;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private EmailService emailService;

	private Optional<User> optional;
	
	@Override
	   public List<Country> getCountries() {

	        return countryRepo.findAll();

	    }

	    @Override
	    public List<State> getStates(Integer countryId) {

	    	return stateRepo.getStatesByCountryId(String.valueOf(countryId));

	    }

	    @Override
	    public List<City> getCities(Integer stateId) {

	        return cityRepo.findByStateId(stateId);

	    }
	    @Override
	   public String registerUser(User user) {
		   
	    	String tempPwd = PasswordUtil.generatePassword();
	    	String encryptedPwd = encoder.encode(tempPwd);
	    	user.setPassword(encryptedPwd);
	    	user.setStatus("Locked");
	    	userRepository.save(user);
	    	
	    	String body = 
	    			"Your Temporary Password :"
	    			+tempPwd
	    	        +"\n\n"
	    	        +"Click below link to unlock account\n"
	    	        +"http://localhost:8080/unlock";
	    	
	    	emailService.sendMail(user.getEmail(), "Unlock your account", body);
	    	
	    	return "Registration successful";
	    }
	 
	    @Override
	public String login(String email, String password) {
		Optional<User>optional = userRepository.findByEmail(email);
		
		if(optional.isEmpty()) {
			
			return "Invalid Credentials";
		}
		User user = optional.get();
		
		if(user.getStatus().equals("Locked")) {
			return "Your Account is Locked";
		}
		return "Success";
	    }
	
	@Override
	public String unlockAccount(
	        String email,
	        String tempPwd,
	        String newPwd) {
	    	Optional<User>optional = userRepository.findByEmail(email);
	    	
	    	if(optional.isEmpty()) {
	    		
	    		return "Invalid email";
	    	}
	    	 User user = optional.get();
	    	 
	    	 if (!encoder.matches(tempPwd, user.getPassword())) {
	    		    return "Temporary password incorrect";
	    		}
	    	 user.setPassword( encoder.encode(newPwd));
	    	 user.setStatus("UNLOCKED");
	    	 userRepository.save(user);
	    	 
	    	 return "Account Unlocked Successfully";
	    }
	   
 @Override
	    public String forgotPassword(String email) {
	 User user = optional.get();

	 emailService.sendMail(
	     email,
	     "Forgot Password",
	     "Your password reset link..."
	 );

	 return "Password reset link sent successfully";
 }
    	
}	    	
 
	    			
	    
	    
	    
	    
	    
	    
	    
	    
