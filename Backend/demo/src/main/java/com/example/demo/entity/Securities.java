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
	
	@Column(name = "isin")
	private String isin;
	
	@Column(name = "cusip")
	private String cusip;
	
	@Column(name = "issuer")
	private String issuer;

	@Column(name = "coupon")
	private String coupon;
	@Column(name = "type")
	private String type;
	
	public Securities(int securityId, LocalDateTime maturityDate, int faceValue, String status, String isin,
			String cusip, String issuer, String coupon, String type) {
		super();
		this.securityId = securityId;
		this.maturityDate = maturityDate;
		this.faceValue = faceValue;
		this.status = status;
		this.isin = isin;
		this.cusip = cusip;
		this.issuer = issuer;
		this.coupon = coupon;
		this.type = type;
	}
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
	public String getIsin() {
		return isin;
	}
	public void setIsin(String isin) {
		this.isin = isin;
	}
	public String getCusip() {
		return cusip;
	}
	public void setCusip(String cusip) {
		this.cusip = cusip;
	}
	public String getIssuer() {
		return issuer;
	}
	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}
	public String getCoupon() {
		return coupon;
	}
	public void setCoupon(String coupon) {
		this.coupon = coupon;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	

	
	
}
