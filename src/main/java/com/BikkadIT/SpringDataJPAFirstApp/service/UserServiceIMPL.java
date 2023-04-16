package com.BikkadIT.SpringDataJPAFirstApp.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.BikkadIT.SpringDataJPAFirstApp.model.User;
import com.BikkadIT.SpringDataJPAFirstApp.repository.UserRepository;


@Service
public class UserServiceIMPL implements UserServiceI {
	@Autowired
	private UserRepository userRepository;

	@Override
	public int SaveUser(User user) {
		
		User user2 = userRepository.save(user);
		return user2.getUserID();
	}

	@Override
	public List<User> saveAllUser(List<User> list) {
		Iterable<User> saveAll = userRepository.saveAll(list);
		return (List<User>) saveAll;
	}

	@Override
	public User getUSerId(int userid) {

		User findById = userRepository.findById(userid).get();
		return findById;
	}

	@Override
	public List<User> getAllUser() {
		Iterable<User> findAll = userRepository.findAll();
		return (List<User>) findAll;
	}

	@Override
	public List<User> getAllUserById(List<Integer> list) {
		Iterable<User> findAllById = userRepository.findAllById(list);
		return (List<User>) findAllById;
	}

	@Override
	public boolean recordIdExitOrNot(int userId) {
		boolean existsById = userRepository.existsById(userId);
		return existsById;
	}

	@Override
	public long NoOfRecords() {
		long count = userRepository.count();
		return count;
	}

	@Override
	public void recordDeleteByID(Integer id) {
		userRepository.deleteById(id);
		
	}

	@Override
	public boolean recordDeleteByObject(User user) {
		
		int userID = user.getUserID();
		boolean existsById = userRepository.existsById(userID);
		if(existsById){
			userRepository.delete(user);
			return true;
		}else {
		return false;
	}
	}

	@Override
	public boolean recordDeleteByMultiplePK(List<Integer> list) {
		
		List<User> findAll = (List<User>) userRepository.findAll();
		boolean b = findAll.containsAll(findAll);
		if(b) {
		userRepository.deleteAllById(list);
		return true;
		}else {
			return false;
		}
	}

	@Override
	public void AllRecordDelete(User user) {
		userRepository.deleteAll();
		
	}



	


}

		



