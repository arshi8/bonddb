package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class BookUsers {
	@Id
	@Column(name = "access_id")
	private int accessId;
	@Column(name = "user_id")
	private int userId;
	@Column(name = "book_id")
	private int bookId;
	public BookUsers(int accessId, int userId, int bookId) {
		super();
		this.accessId = accessId;
		this.userId = userId;
		this.bookId = bookId;
	}
	public int getAccessId() {
		return accessId;
	}
	public void setAccessId(int accessId) {
		this.accessId = accessId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	

}