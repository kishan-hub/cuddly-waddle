package com.urotaxi.form;

import java.io.Serializable;

public class RegisterUserForm implements Serializable {
	
	private static final long serialVersionUID = 1L;

	protected int userId;
	
	protected String firstName;
	
	protected String lastName;
	
	protected String mobile;
	
	protected String email;
		
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


	
	

}
