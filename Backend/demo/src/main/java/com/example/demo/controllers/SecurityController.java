package com.example.demo.controllers;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	@GetMapping("/")
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
	 public List<Securities> findByMaturityDate(@PathVariable LocalDate arg)
	 {
		 
		 return this.securitiesservice.findByMaturityDate(arg);
	 }
	 @PostMapping("/saveSecurity")
	    public Securities saveSecurity(@RequestBody Securities securities){
	        return this.securitiesservice.saveSecurity(securities);
	    }
	 
	 @PutMapping("/updateSecurity")
	    public Securities updateSecurity(@RequestBody Securities securities){
	        return this.securitiesservice.saveSecurity(securities);
	    }
	 @GetMapping("/MaturityDateRange")
	    public List<Securities> findByMaturityDateRange(
	            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate startDate,
	            @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate endDate) {
	        return securitiesservice.findByMaturityDateBetween(startDate, endDate);
	    }

	

}
