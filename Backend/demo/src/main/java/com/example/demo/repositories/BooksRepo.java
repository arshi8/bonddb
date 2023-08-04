package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Books;


public interface BooksRepo extends JpaRepository<Books, Integer> {
	

}