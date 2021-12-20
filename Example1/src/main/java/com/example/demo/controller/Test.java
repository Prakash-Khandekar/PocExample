package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.poc.model.UserInfo;
import com.neosoft.poc.service.IUserService;

@RestController
public class Test {
	 @Autowired
     private IUserService service;
  
	@RequestMapping("/All")
	public String testMethod() {
		System.out.println("hiii");
		return "Hello qqqq77";
	}
	 @RequestMapping("/Add")
		public String saveUserDetails(@RequestBody UserInfo user) {
		System.out.println("hhh");
			return service.insertEmployee(user);
			
		}
}
