package com.example.demo.services;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.Book;
import com.example.demo.entity.BookUsers;
import com.example.demo.entity.Securities;
import com.example.demo.entity.Trades;
import com.example.demo.repositories.BookUserRepo;
import com.example.demo.repositories.BooksRepo;
import com.example.demo.repositories.TradesRepo;

@Service
public class BooksService {
	@Autowired
	private BooksRepo booksrepo;
	@Autowired
	public BooksService(BooksRepo booksrepo) {
		super();
	
	}
	
	 public List<Book> findByBookId(@PathVariable int arg)
	 {
		 return this.booksrepo.findByBookId(arg);
	 }
	public List<Book> findByBookName(String bookName)
	{
		 return this.booksrepo.findByBookName(bookName);
		
	}

	 
	public List<Book> findAll() 
	{
		return this.booksrepo.findAll();
	}



	 public Book addBook(Book b){
	        return this.booksrepo.save(b);
	    }
    

	 
}
