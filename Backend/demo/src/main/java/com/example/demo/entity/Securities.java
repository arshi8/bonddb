package com.example.demo.entity;


import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Entity
@Table
@NoArgsConstructor
public class Securities {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "security_id")
	private int securityId;
	@Column(name = "maturity_date")
	private LocalDateTime maturityDate;
	@Column(name = "face_value")
	private int faceValue;
	@Column(name = "status")
	private String status;
	public int getSecurityId() {
		return securityId;
	}
	public void setSecurityId(int securityId) {
		this.securityId = securityId;
	}
	public LocalDateTime getMaturityDate() {
		return maturityDate;
	}
	public void setMaturityDate(LocalDateTime maturityDate) {
		this.maturityDate = maturityDate;
	}
	public int getFaceValue() {
		return faceValue;
	}
	public void setFaceValue(int faceValue) {
		this.faceValue = faceValue;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Securities(int securityId, LocalDateTime maturityDate, int faceValue, String status) {
		super();
		this.securityId = securityId;
		this.maturityDate = maturityDate;
		this.faceValue = faceValue;
		this.status = status;
	}
	
	
}
