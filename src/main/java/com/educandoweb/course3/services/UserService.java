package com.educandoweb.course3.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course3.entities.User;
import com.educandoweb.course3.repositories.UserRepositoty;

@Service
public class UserService {
	
	@Autowired
	private UserRepositoty repositoty;
	
	public List<User> findAll() {
		return repositoty.findAll();
		
	}
	
	public User findById(Long id) {
		Optional<User> obj = repositoty.findById(id);
		return obj.get();
	}

}
