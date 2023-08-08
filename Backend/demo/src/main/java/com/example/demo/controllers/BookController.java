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

import com.example.demo.entity.Book;
import com.example.demo.entity.BookUsers;
import com.example.demo.entity.Securities;
import com.example.demo.entity.Trades;
import com.example.demo.repositories.SecuritiesRepo;
import com.example.demo.services.BooksService;
import com.example.demo.services.BookuserService;
import com.example.demo.services.SecuritiesService;


@RestController
@RequestMapping(path = "/bondsdb/books")
public class BookController {
	@Autowired
	private BooksService booksservice;
	@GetMapping("/")
	 public List<Book> findAll()
	 {
		 return this.booksservice.findAll();
	 }
	
	@PostMapping("/addBook")
    public Book addBookUser(@RequestBody Book bookusers){
        return this.booksservice.addBook(bookusers);
    }
	

	

}
