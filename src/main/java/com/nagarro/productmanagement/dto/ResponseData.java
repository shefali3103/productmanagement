package com.nagarro.productmanagement.dto;

public class ResponseData {
	private int id;
	private String token;
	private String username;
	
	
	public ResponseData(){}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
}
