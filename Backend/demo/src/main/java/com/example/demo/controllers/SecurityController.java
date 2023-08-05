package com.example.demo.controllers;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Securities;
import com.example.demo.entity.Trades;
import com.example.demo.repositories.SecuritiesRepo;
import com.example.demo.services.SecuritiesService;


@RestController
@RequestMapping(path = "/bondsdb/security")
public class SecurityController {
	@Autowired
	private SecuritiesService securitiesservice;
	@GetMapping
	 public List<Securities> findAll()
	 {
		 return this.securitiesservice.findAll();
	 }
	@GetMapping("/SecurityId/{arg}")
	 public List<Securities> findBySecurityId(@PathVariable int arg)
	 {
		 
		 return this.securitiesservice.findBySecurityId(arg);
	 }
	@GetMapping("/Status/{arg}")
	 public List<Securities>findByStatus (@PathVariable String arg)
	 {
		 
		 return this.securitiesservice.findByStatus(arg);
	 }
	@GetMapping("/FaceValue/{arg}")
	 public List<Securities> findByFaceValue(@PathVariable int arg)
	 {
		 
		 return this.securitiesservice.findByFaceValue(arg);
	 }
	@GetMapping("/MaturityDate/{arg}")
	 public List<Securities> findByMaturityDate(@PathVariable LocalDateTime arg)
	 {
		 
		 return this.securitiesservice.findByMaturityDate(arg);
	 }
	

}
