package com.aprendendoSpring.couseSpring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aprendendoSpring.couseSpring.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
