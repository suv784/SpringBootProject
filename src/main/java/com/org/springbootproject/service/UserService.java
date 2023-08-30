package com.org.springbootproject.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.org.springbootproject.dao.UserDao;
import com.org.springbootproject.dto.User;

@Component
public class UserService {
	
	@Autowired
	UserDao dao;
	
	public String saveUser(User user) {
		dao.saveUser(user);
		return "data saved successfully";
	}
	
	public String updateUserById(int id, User user) {
		
		boolean isPresent = dao.updateUser(id, user);
				if(isPresent) {
					return "data updated successfully";
				}
		return "Id Not Found";
	}
	
	public List<User>fetchByName(String name){
		return dao.fetchByName(name);		
	} 
	public Set<User>fetchByEmail(String email){
		return dao.fetchByMail(email);
	}

}
