package com.sql.Model;

public class Order {
	private int oId;
	private int userId;
	private String name;
	private String country;
	private String address;
	private String zip;
	private String phone;
	private String email;
	private String note;
	private int total;
	public Order(int oId, int userId, String name, String country, String address, String zip, String phone,
			String email,  int total, String note) {
		super();
		this.oId = oId;
		this.userId = userId;
		this.name = name;
		this.country = country;
		this.address = address;
		this.zip = zip;
		this.phone = phone;
		this.email = email;
		this.note = note;
		this.total = total;
	}
	public int getoId() {
		return oId;
	}
	public void setoId(int oId) {
		this.oId = oId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "Order [oId=" + oId + ", userId=" + userId + ", name=" + name + ", country=" + country + ", address="
				+ address + ", zip=" + zip + ", phone=" + phone + ", email=" + email + ", note=" + note + ", total="
				+ total + "]";
	}
}
