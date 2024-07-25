package com.sql.Model;
//Hai
public class Author {
	private int  auId;
	private String auName;
	public int getAuId() {
		return auId;
	}
	public void setAuId(int auId) {
		this.auId = auId;
	}
	public String getAuName() {
		return auName;
	}
	public void setAuName(String auName) {
		this.auName = auName;
	}
	public Author(int auId, String auName) {
		super();
		this.auId = auId;
		this.auName = auName;
	}
	@Override
	public String toString() {
		return "Author [auId=" + auId + ", auName=" + auName + "]";
	}
	
}
