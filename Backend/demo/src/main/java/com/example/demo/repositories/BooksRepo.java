package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Book;

@Repository
public interface BooksRepo extends JpaRepository<Book, Integer> {
	
	List<Book> findByBookId(int bookId);
	List<Book> findByBookName(String bookName);
}