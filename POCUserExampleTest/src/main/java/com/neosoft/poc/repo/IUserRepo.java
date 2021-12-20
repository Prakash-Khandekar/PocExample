package com.neosoft.poc.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neosoft.poc.model.UserInfo;

public interface IUserRepo extends JpaRepository<UserInfo, Integer> {

	//List<UserInfo> findByFName(String fName);
	//List<UserInfo> findByFName(String name);

}
