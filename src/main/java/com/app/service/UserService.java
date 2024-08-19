package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.app.entity.User;
import com.app.repo.UserRepo;

public interface UserService {
	
	@Autowired
	public void registerUser(User user);
	

}
