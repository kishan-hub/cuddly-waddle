package com.urotaxi.form;

import java.io.Serializable;

public class PassangerDataForm implements Serializable {
	
	private static final long serialVersionUID = 1L;

	protected String name;
	
	protected String phoneNo;
	
	protected String message;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
	
	

}
