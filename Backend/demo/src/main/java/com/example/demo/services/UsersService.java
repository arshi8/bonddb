package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.Trades;
import com.example.demo.entity.Users;
import com.example.demo.repositories.TradesRepo;
import com.example.demo.repositories.UsersRepo;

public class UsersService {
	@Autowired
	private UsersRepo usersrepo;
	@Autowired
	public UsersService(UsersRepo usersrepo) {
		super();
	
	}

	public List<Users> findByUserEmail(@PathVariable String userEmail)
	{
		 return this.usersrepo.findByUserEmail(userEmail);

	}

	 public List<Users> findByUserId(@PathVariable int arg)
	 {
		 return this.usersrepo.findByUserId(arg);
	 }

}
