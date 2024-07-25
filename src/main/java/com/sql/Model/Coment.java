package com.sql.Model;

import java.util.Date;

public class Coment {
	private int Review_ID;
	private int blogID;
	private String content;
	private String name;
	private String email;
	private String phone;
	private Date day;
	public int getReview_ID() {
		return Review_ID;
	}
	public void setReview_ID(int review_ID) {
		Review_ID = review_ID;
	}
	public int getBlogID() {
		return blogID;
	}
	public void setBlogID(int blogID) {
		this.blogID = blogID;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getDay() {
		return day;
	}
	public void setDay(Date day) {
		this.day = day;
	}
	public Coment(int review_ID, int blogID, String content, String name, String email, String phone, Date day) {
		super();
		Review_ID = review_ID;
		this.blogID = blogID;
		this.content = content;
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.day = day;
	}
	
	
}
