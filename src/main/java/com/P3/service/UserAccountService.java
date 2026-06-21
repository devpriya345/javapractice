package com.P3.service;

import java.util.List;

import com.P3.entity.UserAccount;

public interface UserAccountService {
	public String saveOrUpdateUserAcc(UserAccount userAcc );
	
	public List<UserAccount>getAllUserAccounts();
	
	public UserAccount getUserAccount (Integer userId);
	
	public boolean deleteUserAcc(Integer userId);
	
	public boolean updateUserAccStatus(Integer userId , String status);
}
