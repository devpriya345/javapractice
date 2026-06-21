package com.P3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.P3.entity.UserAccount;
import com.P3.repository.UserAccountRepo;

@Service
public class UserAccountServiceImpl implements UserAccountService {
	
	@Autowired
	private UserAccountRepo userAccountRepo;
	
	@Override
	public String saveOrUpdateUserAcc(UserAccount userAcc) {
		
		System.out.println("Saving User : " + userAcc);
		
		Integer userId = userAcc.getUserid();
		
		  //upsert(insert or update)
		userAccountRepo.save(userAcc);  
		if(userId == null) {
			return "user record save";  
		}else {
			return "user record updated";
		}
	}

	@Override
	public List<UserAccount> getAllUserAccounts() {
		
		return userAccountRepo.findAll(); //to retrive all records from table
	}

	@Override
	public UserAccount getUserAccount(Integer userId) {
		
	Optional<UserAccount>findById = userAccountRepo.findById(userId);
	if(findById.isPresent()) {
		return findById.get();  //use to retirve reocord based on id  
	}
		return null;
	}

	@Override
	public boolean deleteUserAcc(Integer userId) {
		
		boolean existsById = userAccountRepo.existsById(userId);
		if(existsById) {
		userAccountRepo.deleteById(userId);
		return true;
		}else{
			return false;
		}
	}

	@Override
	public boolean updateUserAccStatus(Integer userId, String status) {
		try {
			userAccountRepo.updateUserAccStatus(userId,status);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
