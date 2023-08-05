package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Securities;
import java.time.LocalDateTime;


@Repository
public interface SecuritiesRepo extends JpaRepository<Securities, Integer> {
	List<Securities> findByFaceValue(int faceValue);
	List<Securities> findByMaturityDate(LocalDateTime maturityDate);
	List<Securities> findBySecurityId(int securityId);
	List<Securities> findByStatus(String status);
}
