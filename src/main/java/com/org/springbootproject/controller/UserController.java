package com.org.springbootproject.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.org.springbootproject.dto.User;
import com.org.springbootproject.service.UserService;

@RestController
public class UserController {

	@Autowired 
	UserService service;
	
	@RequestMapping("/save")
	public String saveUser(@RequestBody User user) {
		return service.saveUser(user);
	}
	@RequestMapping("/updateUser/(id)")
	public String updateById(@PathVariable("id") int userId,@RequestBody User user) {
		return service.updateUserById(userId, user);
	}
	@RequestMapping("/fetchByName/{name}")
	public List<User>fetchByName(@PathVariable String name){
		return service.fetchByName(name);
	}
	@RequestMapping("/fetchByEmail/{email}")
	public Set<User>fetchByEmail(@PathVariable String email){
		return fetchByEmail(email);
		
	}
	/*public boolean updateByName(String name,User user) {
		List<User>findByName=repo.findBYName()
	}*/
	 

}
