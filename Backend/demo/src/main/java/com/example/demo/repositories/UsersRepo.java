package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Users;


public interface UsersRepo extends JpaRepository<Users, Integer> {
	
	
}
