package com.sql.Model;
//Hai
public class User {
	private int uID ;
	private String uName;
	private String uPhone;
	private String uImage;
	private String email;
	private String uPass;
	private String uTK;
	private String isBloger;
	private String isUser;
	private String isAdmin;
	public int getuID() {
		return uID;
	}
	public void setuID(int uID) {
		this.uID = uID;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	public String getuPhone() {
		return uPhone;
	}
	public void setuPhone(String uPhone) {
		this.uPhone = uPhone;
	}
	public String getuImage() {
		return uImage;
	}
	public void setuImage(String uImage) {
		this.uImage = uImage;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getuPass() {
		return uPass;
	}
	public void setuPass(String uPass) {
		this.uPass = uPass;
	}
	public String getuTK() {
		return uTK;
	}
	public void setuTK(String uTK) {
		this.uTK = uTK;
	}
	public String getIsBloger() {
		return isBloger;
	}
	public void setIsBloger(String isBloger) {
		this.isBloger = isBloger;
	}
	public String getIsUser() {
		return isUser;
	}
	public void setIsUser(String isUser) {
		this.isUser = isUser;
	}
	public String getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(String isAdmin) {
		this.isAdmin = isAdmin;
	}
	public User(int uID, String uName, String uPhone, String uImage, String email, String uPass, String uTK,
			String isBloger, String isUser, String isAdmin) {
		super();
		this.uID = uID;
		this.uName = uName;
		this.uPhone = uPhone;
		this.uImage = uImage;
		this.email = email;
		this.uPass = uPass;
		this.uTK = uTK;
		this.isBloger = isBloger;
		this.isUser = isUser;
		this.isAdmin = isAdmin;
	}
	@Override
	public String toString() {
		return "User [uID=" + uID + ", uName=" + uName + ", uPhone=" + uPhone + ", uImage=" + uImage + ", email="
				+ email + ", uPass=" + uPass + ", uTK=" + uTK + ", isBloger=" + isBloger + ", isUser=" + isUser
				+ ", isAdmin=" + isAdmin + "]";
	}

}
