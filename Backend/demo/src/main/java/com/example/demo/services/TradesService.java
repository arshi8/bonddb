package com.example.demo.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.Trades;

import com.example.demo.repositories.TradesRepo;

@Service
public class TradesService {
	@Autowired
	private TradesRepo tradesrepo;
	@Autowired
	 public TradesService(TradesRepo traderepo) {
		// TODO Auto-generated constructor stub
		super();
	}
	

	 public List<Trades> findByTradeId(@PathVariable int arg)
	 {
		 
		 return this.tradesrepo.findByTradeId(arg);
	 }

	 public List<Trades> findByType(@PathVariable String arg)
	 {
		 
		 return this.tradesrepo.findByType(arg);
	 }

	 public List<Trades>findByStatus (@PathVariable String arg)
	 {
		 
		 return this.tradesrepo.findByStatus(arg);
	 }

	 public List<Trades>findByTradeDate (@PathVariable LocalDateTime arg)
	 {
		 
		 return this.tradesrepo.findByTradeDate(arg);
	 }

	 public List<Trades>findByQuantity (@PathVariable int arg)
	 {
		 
		 return this.tradesrepo.findByQuantity(arg);
	 }

	 public List<Trades>findByPrice (@PathVariable int arg)
	 {
		 
		 return this.tradesrepo.findByPrice(arg);
	 }

	 public List<Trades>findByBookId (@PathVariable int arg)
	 {
		 
		 return this.tradesrepo.findByBookId(arg);
	 }

	public List<Trades> findAll() {
		// TODO Auto-generated method stub
		return this.tradesrepo.findAll();
	}
	 
}
