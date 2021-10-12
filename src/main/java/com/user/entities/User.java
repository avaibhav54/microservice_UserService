package com.user.entities;

import java.util.ArrayList;
import java.util.List;

public class User {

	private int userId;
	private String name;
	private String phone;
	private List<contact> contacts=new ArrayList<>();
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public List<contact> getContacts() {
		return contacts;
	}
	public void setContacts(List<contact> contacts) {
		this.contacts = contacts;
	}
	public User(int userId, String name, String phone, List<contact> contacts) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
		this.contacts = contacts;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int userId, String name, String phone) {
		super();
		this.userId = userId;
		this.name = name;
		this.phone = phone;
	}
	
	
}
