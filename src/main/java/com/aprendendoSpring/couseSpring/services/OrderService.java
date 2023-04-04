package com.aprendendoSpring.couseSpring.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aprendendoSpring.couseSpring.entities.Order;
import com.aprendendoSpring.couseSpring.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order findAllId(Long id) {
		Optional<Order> obj = repository.findById(id);
		
		return obj.get();
	}
}
