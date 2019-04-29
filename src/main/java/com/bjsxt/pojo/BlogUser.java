package com.bjsxt.pojo;

import java.io.Serializable;

public class BlogUser implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6073364825259939170L;
	private int userId;
	private String userName;
	private String password;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
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
	@Override
	public String toString() {
		return "BlogUser [userId=" + userId + ", userName=" + userName
				+ ", password=" + password + "]";
	}
	
}
