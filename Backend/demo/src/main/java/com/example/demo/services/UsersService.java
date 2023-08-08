package com.example.demo.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.Trades;
import com.example.demo.entity.Users;
import com.example.demo.repositories.TradesRepo;
import com.example.demo.repositories.UsersRepo;
@Service
public class UsersService {
	@Autowired
	private UsersRepo usersrepo;
	@Autowired
	public UsersService(UsersRepo usersrepo) {
		super();

	}

	public List<Users> findAll() {
		return this.usersrepo.findAll();
	}


	 public Users addUsers(Users u){
	        return this.usersrepo.save(u);
	    }
	
	 
	 

}
