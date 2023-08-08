package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.BookUsers;

import java.time.LocalDateTime;


@Repository
public interface BookUserRepo extends JpaRepository<BookUsers, Integer> {
	List<BookUsers> findByBookId(int bookId);
	List<BookUsers> findByUserId(int userId);	
}
