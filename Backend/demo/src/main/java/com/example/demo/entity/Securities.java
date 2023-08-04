package com.example.demo.entity;


import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Securities {
	@Id
	@Column(name = "security_id")
	private int securityId;
	@Column(name = "maturity_date")
	private LocalDateTime maturityDate;
	@Column(name = "face_value")
	private int faceValue;
	@Column(name = "status")
	private String status;
}
