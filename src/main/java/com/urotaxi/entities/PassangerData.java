package com.urotaxi.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "passanger_details")
public class PassangerData implements Serializable
{
	
	private static final long serialVersionUID = 7325232410399231239L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	protected int passanger_no;
    
	@Column(name = "phone_no")
	protected int phoneNo;
	
	private String name;
	
	private String message;

	public int getPassanger_no() {
		return passanger_no;
	}

	public void setPassanger_no(int passanger_no) {
		this.passanger_no = passanger_no;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "PassangerData [passanger_no=" + passanger_no + ", phoneNo=" + phoneNo + ", name=" + name + ", message="
				+ message + "]";
	}
}
