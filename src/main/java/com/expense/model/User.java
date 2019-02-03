package com.expense.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class User {

	private String userId;
	@JsonIgnore
	private String password;
	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
