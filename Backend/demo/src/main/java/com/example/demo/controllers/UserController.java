package com.example.demo.controllers;

import java.time.LocalDateTime;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Users;

import com.example.demo.services.UsersService;


@RestController
@RequestMapping(path = "/bondsdb/users")
public class UserController {
	@Autowired
	private UsersService usersservice;
	@GetMapping("/")
	 public List<Users> findAll()
	 {
		 return this.usersservice.findAll();
	 }
	
	 @PostMapping("/addUsers")
	    public Users addUsers(@RequestBody Users users){
	        return this.usersservice.addUsers(users);
	    }
	 
}
