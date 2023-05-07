package com.urotaxi.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_details")
public class Registeration implements Serializable{

	private static final long serialVersionUID = 34525375362L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected int userId;
  
	@Column(name = "first_name")
	protected String firstName;
	
	@Column(name = "last_name")
	protected String lastName;
	
	@Column(name = "mobile")
	protected int mobile;
	
	@Column(name = "email")
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

	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
}
