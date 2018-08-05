package com.cg.wallet.bean;


import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Entity
public class Account {
	@Id
	@GeneratedValue
	private int id;
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
private String mobileNo;
private String email;
private String name;
private double balance;
Date date;
public Account(String mobileNo, String email, String name, double balance
		) {
	super();
	this.mobileNo = mobileNo;
	this.email = email;
	this.name = name;
	this.balance = balance;

}
public Account() {
	// TODO Auto-generated constructor stub
}
public String getMobileNo() {
	return mobileNo;
}
public void setMobileNo(String mobileNo) {
	this.mobileNo = mobileNo;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}

}
