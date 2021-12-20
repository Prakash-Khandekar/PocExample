package com.neosoft.poc.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.neosoft.poc.model.UserInfo;

public interface IUserRepo extends JpaRepository<UserInfo, Integer> {

}
