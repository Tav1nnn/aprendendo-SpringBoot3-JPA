package com.aprendendoSpring.couseSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aprendendoSpring.couseSpring.entities.User;
import com.aprendendoSpring.couseSpring.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findAllId(Long id) {
		Optional<User> obj = repository.findById(id);
		
		return obj.get();
	}
}
