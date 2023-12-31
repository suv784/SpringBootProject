package com.org.springbootproject.dao;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import com.org.springbootproject.dto.User;

public interface UserRepo extends JpaRepository<User, Integer> {
	public List<User> findByName(String name);

	public Set<User> findByEmail(String email); 

}
