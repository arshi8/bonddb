package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Counterparties;


public interface CounterpartiesRepo extends JpaRepository<Counterparties, Integer> {
	
	
}
