package com.example.demo.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.BookUsers;
import com.example.demo.entity.Securities;
import com.example.demo.entity.Trades;
import com.example.demo.repositories.BookUserRepo;
import com.example.demo.repositories.TradesRepo;

@Service
public class BookuserService {
	@Autowired
	private BookUserRepo bookuserrepo;
	@Autowired
	public BookuserService(BookUserRepo bookuserrepo) {
		super();
	
	}

	
	 public List<BookUsers> findByBookId(@PathVariable int arg)
	 {
		 return this.bookuserrepo.findByBookId(arg);
	 }
	 

	 

	public List<BookUsers> findAll() 
	{
		return this.bookuserrepo.findAll();
	}


	public List<BookUsers> findByUserId(@PathVariable int arg)
		 {
			 return this.bookuserrepo.findByUserId(arg);
		 }
	 public BookUsers addBookUser(BookUsers b){
	        return this.bookuserrepo.save(b);
	    }
    

	 
}
