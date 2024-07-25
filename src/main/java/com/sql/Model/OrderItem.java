package com.sql.Model;

public class OrderItem {
	private int bookId;
	private Book book;
	private int quantity;
	private int OderID;
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public Book getBook() {
		return book;
	}
	public void setBook(Book book) {
		this.book = book;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getOderID() {
		return OderID;
	}
	public void setOderID(int oderID) {
		OderID = oderID;
	}
	public OrderItem(int bookId, Book book, int quantity, int oderID) {
		super();
		this.bookId = bookId;
		this.book = book;
		this.quantity = quantity;
		OderID = oderID;
	}
	public OrderItem(int bookId, int quantity, int oderID) {
		super();
		this.bookId = bookId;
		this.quantity = quantity;
		OderID = oderID;
	}

}
