package com.example.demo.entity;
import java.sql.Date;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table
@NoArgsConstructor

public class Trades {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "trade_id")
	private int tradeId;
	@Column(name = "quantity")
	private int quantity;
	@Column(name = "status")
	private String status;
	@Column(name = "price")
	private int price;
	@Column(name = "type")
	private String type;
	@Column(name = "trade_date")
	private LocalDateTime tradeDate;
	@Column(name = "book_id")
	private int bookId;
	public Trades(int tradeId, int quantity, String status, int price, String type, LocalDateTime tradeDate, int bookId) {
		super();
		this.tradeId = tradeId;
		this.quantity = quantity;
		this.status = status;
		this.price = price;
		this.type = type;
		this.tradeDate = tradeDate;
		this.bookId = bookId;
	}
	public int getTradeId() {
		return tradeId;
	}
	public void setTradeId(int tradeId) {
		this.tradeId = tradeId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public LocalDateTime getTradeDate() {
		return tradeDate;
	}
	public void setTradeDate(LocalDateTime tradeDate) {
		this.tradeDate = tradeDate;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	
}
