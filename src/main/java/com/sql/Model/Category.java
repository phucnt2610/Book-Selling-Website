package com.sql.Model;
//Hai
public class Category {
	private int CId;
	private String CName;
	public Category(int cId, String cName) {
		super();
		CId = cId;
		CName = cName;
	}
	public int getCId() {
		return CId;
	}
	public void setCId(int cId) {
		CId = cId;
	}
	public String getCName() {
		return CName;
	}
	public void setCName(String cName) {
		CName = cName;
	}
	@Override
	public String toString() {
		return "Category [CId=" + CId + ", CName=" + CName + "]";
	}
	
	
}
