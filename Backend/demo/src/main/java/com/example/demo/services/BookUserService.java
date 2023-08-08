package com.example.demo.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.BookUsers;
import com.example.demo.entity.Securities;
import com.example.demo.entity.Trades;
import com.example.demo.repositories.BookUserRepo;
import com.example.demo.repositories.SecuritiesRepo;

@Service
public class BookUserService {
	@Autowired
	private BookUserRepo bookusersrepo;
	@Autowired
	public BookUserService (BookUserRepo bookusersrepo)
	{
		super();
		
	}

	 public List<BookUsers> findByBookId(@PathVariable int arg)
	 {
		 
		 return this.bookusersrepo.findByBookId(arg);
	 }

	 public List<BookUsers>findByUserId (@PathVariable int arg)
	 {
		 
		 return this.bookusersrepo.findByUserId(arg);
	 }


	public List<BookUsers> findAll() {
		// TODO Auto-generated method stub
		 return this.bookusersrepo.findAll();
	}

}
