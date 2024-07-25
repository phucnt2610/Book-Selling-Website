package com.sql.Model;

public class CartItem {
	private int itemID;
	private int cId;
	private int quantity;
	private Book book;
	public Book getBook() {
		return book;
	}

	public int getItemID() {
		return itemID;
	}

	public CartItem(int itemID, int cId, int quantity, Book book) {
		super();
		this.itemID = itemID;
		this.cId = cId;
		this.quantity = quantity;
		this.book = book;
	}

	public void setItemID(int itemID) {
		this.itemID = itemID;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "CartItem [itemID=" + itemID + ", cId=" + cId + ", quantity=" + quantity + ", book=" + book + "]";
	}

	
	
}
