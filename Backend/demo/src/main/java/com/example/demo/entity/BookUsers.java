package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;

@Entity
@Table(name="bookusers")
@NoArgsConstructor
public class BookUsers {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "access_id")
	private int accessId;
	@Column(name = "user_id")
	private int userId;
	@Column(name = "book_id")
	private int bookId;
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
	public BookUsers(int accessId, int userId, int bookId) {
		super();
		this.accessId = accessId;
		this.userId = userId;
		this.bookId = bookId;
	}
	
	

}
