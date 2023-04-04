package com.aprendendoSpring.couseSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendoSpring.couseSpring.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
