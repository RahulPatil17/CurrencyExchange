package com.BikkadIT.SpringDataJPAFirstApp.controller;

import java.security.PublicKey;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.BikkadIT.SpringDataJPAFirstApp.model.User;
import com.BikkadIT.SpringDataJPAFirstApp.service.UserServiceI;

@Component
public class UserController {
	@Autowired
	private UserServiceI userServiceI;

	public String saveUser(User user) {
		int saveUser = userServiceI.SaveUser(user);
		String msg="User Save With ID "+saveUser;			
		return msg;
		
	}
	
	public List<User> saveUserAll(List<User> list) {
		List<User> saveAllUser = userServiceI.saveAllUser(list);
		
		return saveAllUser;
		
	}

	public User getUSerId(int userid) {

		User findById = userServiceI.getUSerId(userid);
		return findById;
	}

	public List<User> getAllUser() {
		Iterable<User> findAll = userServiceI.getAllUser();
		return (List<User>) findAll;
	}
	
	public List<User> getAllUserById(List<Integer> list) {
		Iterable<User> findAllById = userServiceI.getAllUserById(list);
		return (List<User>) findAllById;
	}
	
	
	public boolean recordIdExitOrNot(int userId) {
		boolean existsById = userServiceI.recordIdExitOrNot(userId);
		return existsById;
	}
	
	public long NoOfRecords() {
		long count = userServiceI.NoOfRecords();
		return count;
	}

	
	public void recordDeleteByID(Integer id) {
		userServiceI.recordDeleteByID(id);
		
	}
	
	public String recordDeleteObject(User user) {
		
		boolean recordDeleteByObject = userServiceI.recordDeleteByObject(user);
		
		if(recordDeleteByObject) {
			
		
		return "Record Deleted Successfully";
		}else {
			return "Not Deleted";
		}
	}		
		
	public String recordDeleteByMultiplePK(List<Integer> list) {
		
			boolean recordDeleteByMultiplePK = userServiceI.recordDeleteByMultiplePK(list);
			
			if(recordDeleteByMultiplePK) {
				return "All record Deleted";
			}else {
			
			return "record not deleted";
			}
			
		}

	
	public void AllRecordDelete1(User user) {
		userServiceI.AllRecordDelete(user);
		
	}
}
