package com.example.demo.controllers;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.Trades;
import com.example.demo.repositories.TradesRepo;
import com.example.demo.services.TradesService;

@RestController
@RequestMapping(path = "/bondsdb/trades")
public class TradeController {
	@Autowired
	private TradesService tradesservice;
	@GetMapping
	 public List<Trades> findAll()
	 {
		 return this.tradesservice.findAll();
	 }
	@GetMapping("/tradeId/{args}")
	 public List<Trades> findByTradeId(@PathVariable int args)
	 {
		 
		 return this.tradesservice.findByTradeId(args);
	 }
	@GetMapping("/Type/{arg}")
	 public List<Trades> findByType(@PathVariable String arg)
	 {
		 
		 return this.tradesservice.findByType(arg);
	 }
	@GetMapping("/Status/{arg}")
	 public List<Trades>findByStatus (@PathVariable String arg)
	 {
		 
		 return this.tradesservice.findByStatus(arg);
	 }
	@GetMapping("/TradeDate/{arg}")
	 public List<Trades>findByTradeDate (@PathVariable LocalDateTime arg)
	 {
		 
		 return this.tradesservice.findByTradeDate(arg);
	 }
	@GetMapping("/Quantity/{arg}")
	 public List<Trades>findByQuantity (@PathVariable int arg)
	 {
		 
		 return this.tradesservice.findByQuantity(arg);
	 }
	@GetMapping("/Price/{arg}")
	 public List<Trades>findByPrice (@PathVariable int arg)
	 {
		 
		 return this.tradesservice.findByPrice(arg);
	 }
	@GetMapping("/BookId/{arg}")
	 public List<Trades>findByBookId (@PathVariable int arg)
	 {
		 
		 return this.tradesservice.findByBookId(arg);
	 }
	
	
}
