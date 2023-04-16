package com.BikkadIT.SpringDataJPAFirstApp.service;

import java.util.List;


import com.BikkadIT.SpringDataJPAFirstApp.model.User;

public interface UserServiceI {
	
	public int SaveUser(User user);
	
	public List<User> saveAllUser(List<User> list);
	
	public User getUSerId(int userid);
	
	public List<User> getAllUser();
	
	public List<User> getAllUserById(List<Integer> list);
	
	public boolean recordIdExitOrNot(int userId);
	
	public long NoOfRecords();
	
	public void recordDeleteByID(Integer id);
	
	public boolean recordDeleteByObject(User user);
	
	public boolean recordDeleteByMultiplePK(List<Integer> list);
	
	public void AllRecordDelete(User user);
	


}