package com.neosoft.poc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.poc.model.UserInfo;
import com.neosoft.poc.service.IUserService;

@RestController
public class UserEnrollment {
	@Autowired
	private IUserService service;

	@RequestMapping("/message")
	public String testMethod() {
		return "Hello Simple API";
	}

	@RequestMapping("/addUser") // register new user 
	public String saveUserDetails(@RequestBody UserInfo user) {
		return service.insertEmployee(user); 
	}

	@PutMapping("/modify") // 2- Edit User base on user id
	public ResponseEntity<String> modifyUser(@RequestBody UserInfo tourist) {
		try {
			String msg = service.updateUserDetails(tourist);
			return new ResponseEntity<String>(msg, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> removeToursit(@PathVariable("id") Integer id) {
		try {
			String msg = service.deleteEmployeeByEno(id);
			return new ResponseEntity<String>(msg, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}

	}

	@GetMapping("/sortByField/{field}") // 4. Sort User by DOB & Joining Date --- id,doj,dob
	public ResponseEntity<?> sortByField(@PathVariable("field") String field) {
		try {
			List<UserInfo> list = service.getAll(field);
			return new ResponseEntity<List<UserInfo>>(list, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.NOT_FOUND);
		}

	}

}

//@GetMapping("/deleteUser/{id}")
//public   String deleteEmployee(@PathVariable Integer id) {
//	System.out.println(id);
//	//service.deleteEmployeeByEno(id);
//	return "User deleted successfull";
//}