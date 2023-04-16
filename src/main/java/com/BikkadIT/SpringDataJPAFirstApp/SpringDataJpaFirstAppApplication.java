package com.BikkadIT.SpringDataJPAFirstApp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkadIT.SpringDataJPAFirstApp.controller.UserController;
import com.BikkadIT.SpringDataJPAFirstApp.model.User;

@SpringBootApplication
public class SpringDataJpaFirstAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringDataJpaFirstAppApplication.class, args);
		
		UserController userController = context.getBean(UserController.class);
	
		
		User user=new User();
		user.setUserID(1);
		user.setUserName("Dipali");
		user.setUserAddr("Pune");
		user.setUserAge(20);
			
		User user1=new User();
		user1.setUserID(2);
		user1.setUserName("DipaliCC");
		user1.setUserAddr("Pune");
		user1.setUserAge(21);
	
		User user2=new User();
		user2.setUserID(3);
		user2.setUserName("ShriDip");
		user2.setUserAddr("Pune");
		user2.setUserAge(23);

		//1)save(Object E) -> Insert / Update The Record
//		String saveUser = userController.saveUser(user);
//		System.out.println(saveUser);

	
		
//		List<User> list=new ArrayList<User>();
//		list.add(user);
//		list.add(user1);
//		list.add(user2);
		
		//2. saveAll (Iterable<E> entities ) -> Insert/Update Collection of records.
//		List<User> saveUserAll = userController.saveUserAll(list);
//		for(User u:saveUserAll) {
//			System.out.println(u);
//		}
//		userController.saveUserAll(list).forEach(e-> System.out.println(e));	
//	
		// 3)findById(Serilizable ID) : To retrieve record using Primary key.
//		User uSerId = userController.getUSerId(2);		//getUserID() 2 pass user id
//		System.out.println(uSerId);

		//4)findAllById(Iterable<Serializable> ids) : To find  records using multiple Primary Keys

//		List al=new ArrayList<>();
//		al.add(1);
//		al.add(3);
		
//		List<User> allUserById = userController.getAllUserById(al);
//		System.out.println(allUserById);
		
		//5)findAll ( ) : To retrieve all records from the table
//		List<User> allUser = userController.getAllUser();
//		System.out.println(allUser);
	
//		//	6)existsById(Serilizable Id) : To check presence of record using Primary Key
//		boolean recordIdExitOrNot = userController.recordIdExitOrNot(2);
//		System.out.println(recordIdExitOrNot);
	
	//7)count ( ) : To get total records count of the table
//		long noOfRecords = userController.NoOfRecords();
//		System.out.println(noOfRecords);
		
		
		//8)deleteById(Serializable id) : To delete a record using primary key
//		userController.recordDeleteByID(3);
	
		//9)deleteAllById(Iterable ids) : To delete multiple records using primary keys
//		User u=new User();
//		u.setUserID(1);
//		String recordDeleteObject = userController.recordDeleteObject(u);
//		System.out.println(recordDeleteObject);
		
//		10)delete(Object entity): To delete a record based on entity object
//		List al=new ArrayList<>();
//	//	al.add(1);
//		al.add(2);
//		String recordDeleteByMultiplePK = userController.recordDeleteByMultiplePK(al);
//		System.out.println(recordDeleteByMultiplePK);
		
		//11)deleteAll ( ) : To delete all records from the table
		userController.AllRecordDelete1(user);
	
	}

}
