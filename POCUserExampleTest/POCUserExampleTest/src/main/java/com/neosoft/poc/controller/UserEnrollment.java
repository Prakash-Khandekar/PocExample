package com.neosoft.poc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.poc.model.UserInfo;
import com.neosoft.poc.service.IUserService;

@RestController
public class UserEnrollment {
	
	@Autowired
	private IUserService service;

<<<<<<< master
	@RequestMapping("/message") // Simple API
=======
	@RequestMapping("/message")
>>>>>>> f8ceab2 Soft Deletion Done
	public String testMethod() {
		return "Hello Simple API";
	}

	@RequestMapping("/addUser") // register new user
	public ResponseEntity<String> saveUserDetails(@RequestBody UserInfo user) {
		try {
			String msg = service.insertEmployee(user);
			return new ResponseEntity<String>(msg, HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

<<<<<<< master
	@PutMapping("/modify") // 2- Edit User base on user id// in resp all object to sho
	public ResponseEntity<String> modifyUser(@RequestBody UserInfo user) {
=======
	@PutMapping("/modify") // 2- Edit User base on user id
	public ResponseEntity<String> modifyUser(@RequestBody UserInfo tourist) {
>>>>>>> f8ceab2 Soft Deletion Done
		try {
			String msg = service.updateUserDetails(tourist);
			return new ResponseEntity<String>(msg, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

<<<<<<< master
	@DeleteMapping("/delete/{id}") // soft deletion
	public ResponseEntity<String> removeUser(@PathVariable("id") Integer id) {
=======
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> removeToursit(@PathVariable("id") Integer id) {
>>>>>>> f8ceab2 Soft Deletion Done
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

	@GetMapping("/searchByPinCode/{pinCode}")
	public ResponseEntity<List<UserInfo>> getUserPinCode(@PathVariable("pinCode") Long name) {
		return new ResponseEntity<List<UserInfo>>(service.fechByPinCode(name), HttpStatus.OK);
	}

<<<<<<< master
	@GetMapping("/search")
	public ResponseEntity<List<UserInfo>> getUserByName(@Param("name") String name, @Param("lastName") String lastName,
			@Param("pinCode") Long pinCode) {
		System.out.println("FName " + name + " LName " + lastName + " PinCode " + pinCode);
		return new ResponseEntity<List<UserInfo>>(service.fetchByNameOrSurnameOrPinCode(name, lastName, pinCode),
				HttpStatus.OK);
	}

	
	@GetMapping("/hardDelete/{id}")
	public ResponseEntity<String> hardDeleteUser(@PathVariable Integer id) {
		String use = service.hardDelete(id);
		System.out.println(use);
		String msg = id+" User deleted successfull";
		return new ResponseEntity<String>(msg,HttpStatus.OK);
	}
}
=======
//@GetMapping("/deleteUser/{id}")
//public   String deleteEmployee(@PathVariable Integer id) {
//	System.out.println(id);
//	//service.deleteEmployeeByEno(id);
//	return "User deleted successfull";
//}
>>>>>>> f8ceab2 Soft Deletion Done
