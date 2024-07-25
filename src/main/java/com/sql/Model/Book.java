package com.sql.Model;
//Hai
public class Book {
	private int BId;
	private String BName;
	private int BPrice;
	private int BPriceSale;
	private String BImage;
	public Book(int bId, String bName, int bPrice, int bPriceSale, String bImage) {
		super();
		BId = bId;
		BName = bName;
		BPrice = bPrice;
		BPriceSale = bPriceSale;
		BImage = bImage;
	}
	public int getBId() {
		return BId;
	}
	public void setBId(int bId) {
		BId = bId;
	}
	public String getBName() {
		return BName;
	}
	public void setBName(String bName) {
		BName = bName;
	}
	public int getBPrice() {
		return BPrice;
	}
	public void setBPrice(int bPrice) {
		BPrice = bPrice;
	}
	public int getBPriceSale() {
		return BPriceSale;
	}
	public void setBPriceSale(int bPriceSale) {
		BPriceSale = bPriceSale;
	}
	public String getBImage() {
		return BImage;
	}
	public void setBImage(String bImage) {
		BImage = bImage;
	}
	@Override
	public String toString() {
		return "Book [BId=" + BId + ", BName=" + BName + ", BPrice=" + BPrice + ", BPriceSale=" + BPriceSale
				+ ", BImage=" + BImage + "]";
	}
	
}