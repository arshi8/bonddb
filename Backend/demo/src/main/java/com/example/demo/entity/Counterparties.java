package com.example.demo.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table


public class Counterparties {
	@Id
	@Column(name = "counterparty_id")
	private int counterpartyId;
	@Column(name = "counterparty_name")
	private String counterpartyName;
	public Counterparties(int counterpartyId, String counterpartyName) {
		super();
		this.counterpartyId = counterpartyId;
		this.counterpartyName = counterpartyName;
	}
	public int getCounterpartyId() {
		return counterpartyId;
	}
	public void setCounterpartyId(int counterpartyId) {
		this.counterpartyId = counterpartyId;
	}
	public String getCounterpartyName() {
		return counterpartyName;
	}
	public void setCounterpartyName(String counterpartyName) {
		this.counterpartyName = counterpartyName;
	}
}
