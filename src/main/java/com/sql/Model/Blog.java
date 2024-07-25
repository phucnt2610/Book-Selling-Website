package com.sql.Model;

import java.util.Date;

//Hai
public class Blog {
	private int blogID;
	private int bId;
	private String blogImage;
	private String blogCon1;
	private String blogCon2;
	private String blogCon3;
	private Date dayCreate;
	private String quotes;
	private String title;
	private String name;
	private String author;
	private String imageEmail;
	private String authorQuotes;
	public int getBlogID() {
		return blogID;
	}
	public void setBlogID(int blogID) {
		this.blogID = blogID;
	}
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getBlogImage() {
		return blogImage;
	}
	public void setBlogImage(String blogImage) {
		this.blogImage = blogImage;
	}
	public String getBlogCon1() {
		return blogCon1;
	}
	public void setBlogCon1(String blogCon1) {
		this.blogCon1 = blogCon1;
	}
	public String getBlogCon2() {
		return blogCon2;
	}
	public void setBlogCon2(String blogCon2) {
		this.blogCon2 = blogCon2;
	}
	public String getBlogCon3() {
		return blogCon3;
	}
	public void setBlogCon3(String blogCon3) {
		this.blogCon3 = blogCon3;
	}
	public Date getDayCreate() {
		return dayCreate;
	}
	public void setDayCreate(Date dayCreate) {
		this.dayCreate = dayCreate;
	}
	public String getQuotes() {
		return quotes;
	}
	public void setQuotes(String quotes) {
		this.quotes = quotes;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Blog(int blogID, int bId, String blogImage, String blogCon1, String blogCon2, String blogCon3,
			Date dayCreate, String quotes, String title, String name, String author, String imageEmail,
			String authorQuotes) {
		super();
		this.blogID = blogID;
		this.bId = bId;
		this.blogImage = blogImage;
		this.blogCon1 = blogCon1;
		this.blogCon2 = blogCon2;
		this.blogCon3 = blogCon3;
		this.dayCreate = dayCreate;
		this.quotes = quotes;
		this.title = title;
		this.name = name;
		this.author = author;
		this.imageEmail = imageEmail;
		this.authorQuotes = authorQuotes;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getImageEmail() {
		return imageEmail;
	}
	public void setImageEmail(String imageEmail) {
		this.imageEmail = imageEmail;
	}
	public String getAuthorQuotes() {
		return authorQuotes;
	}
	public void setAuthorQuotes(String authorQuotes) {
		this.authorQuotes = authorQuotes;
	}

	
}
