package com.neosoft.poc.service;
 

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service;

import com.neosoft.poc.model.UserInfo;
import com.neosoft.poc.repo.IUserRepo;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserRepo repo;
	@Override
	public String insertEmployee(UserInfo user) {
		int id = repo.save(user).getId();
		return "User Enrooled with Id: "+id;
	}

	
}
