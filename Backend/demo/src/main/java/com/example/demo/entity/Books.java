package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Books {
	@Id
	@Column(name = "book_id")
	private int bookId;
	@Column(name = "book_name")
	private String bookName;
	
	public Books(int bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public Books() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
}
