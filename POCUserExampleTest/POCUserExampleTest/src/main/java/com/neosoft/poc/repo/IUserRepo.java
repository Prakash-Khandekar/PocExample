package com.neosoft.poc.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.neosoft.poc.model.UserInfo;


public interface IUserRepo extends JpaRepository<UserInfo, Integer> {
<<<<<<< master
	public List<UserInfo> findByFirstNameOrLastNameOrPinCode(String fName, String lName, Long pinCode);
	public List<UserInfo> findByPinCode(Long pinCode);
	@Query("DELETE FROM USER_INFO u WHERE u.ID = ?1")
    public String hardDelete(Integer id);
 
=======

>>>>>>> f8ceab2 Soft Deletion Done
}
