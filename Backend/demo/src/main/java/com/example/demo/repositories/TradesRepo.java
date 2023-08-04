package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Trades;


public interface TradesRepo extends JpaRepository<Trades, Integer> {
	
	
}
