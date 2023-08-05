package com.example.demo.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.Securities;
import com.example.demo.repositories.SecuritiesRepo;

@Service
public class SecuritiesService {
	private SecuritiesRepo securitiesrepo;
	@Autowired
	public SecuritiesService (SecuritiesRepo securitiesrepo)
	{
		super();
		this.securitiesrepo= securitiesrepo;
	}

	 public List<Securities> findBySecurityId(@PathVariable int arg)
	 {
		 
		 return this.securitiesrepo.findBySecurityId(arg);
	 }

	 public List<Securities>findByStatus (@PathVariable String arg)
	 {
		 
		 return this.securitiesrepo.findByStatus(arg);
	 }

	 public List<Securities> findByFaceValue(@PathVariable int arg)
	 {
		 
		 return this.securitiesrepo.findByFaceValue(arg);
	 }

	 public List<Securities> findByMaturityDate(@PathVariable LocalDateTime arg)
	 {
		 
		 return this.securitiesrepo.findByMaturityDate(arg);
	 }

	public List<Securities> findAll() {
		// TODO Auto-generated method stub
		 return this.securitiesrepo.findAll();
	}

}
