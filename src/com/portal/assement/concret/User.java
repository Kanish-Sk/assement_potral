package com.portal.assement.concret;

public class User {
	String userName;
	String password;
	String fullName;
	public User(String userName, String password, String fullName, int assementMark) {
		super();
		this.userName = userName;
		this.password = password;
		this.fullName = fullName;
		this.assementMark = assementMark;
	}
	int assementMark;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getAssementMark() {
		return assementMark;
	}
	public void setAssementMark(int assementMark) {
		this.assementMark = assementMark;
	}
}
