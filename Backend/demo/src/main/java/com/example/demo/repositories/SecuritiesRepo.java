package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Securities;


public interface SecuritiesRepo extends JpaRepository<Securities, Integer> {
	
	
}
