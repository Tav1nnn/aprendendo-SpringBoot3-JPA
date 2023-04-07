package com.aprendendoSpring.couseSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendoSpring.couseSpring.entities.OrderItem;
import com.aprendendoSpring.couseSpring.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
