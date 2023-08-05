package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Users;

@Repository
public interface UsersRepo extends JpaRepository<Users, Integer> {
	List<Users> findByUserEmail(String userEmail);
	List<Users> findByUserId(int userId);
	
}
