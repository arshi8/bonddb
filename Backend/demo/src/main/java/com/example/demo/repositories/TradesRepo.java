package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Trades;
import java.time.LocalDateTime;


@Repository
public interface TradesRepo extends JpaRepository<Trades, Integer> {
	List<Trades> findByBookId(int bookId);
	List<Trades> findByPrice(int price);
	List<Trades> findByQuantity(int quantity);
	List<Trades> findByStatus(String status);
	List<Trades> findByTradeDate(LocalDateTime tradeDate);
	List<Trades> findByTradeId(int tradeId);
	List<Trades> findByType(String type);
	List<Trades> findAll();
	
}
