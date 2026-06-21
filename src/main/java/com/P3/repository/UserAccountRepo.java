package com.P3.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.P3.entity.UserAccount;

import jakarta.transaction.Transactional;

public interface UserAccountRepo extends JpaRepository<UserAccount, Integer>{

	@Modifying
	@Transactional
	@Query("update UserAccount set activesw=:status where userid=:userid")
	public void updateUserAccStatus(Integer userId, String status);
}
