package com.example.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Counterparties;

@Repository
public interface CounterpartiesRepo extends JpaRepository<Counterparties, Integer> {
	
	List<Counterparties> findByCounterpartyId(int counterpartyId);
	List<Counterparties>  findByCounterpartyName(String counterpartyName);
}
