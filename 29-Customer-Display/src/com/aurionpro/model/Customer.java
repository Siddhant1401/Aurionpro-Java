package com.aurionpro.model;

public class Customer {

	private int id;
	private String name;
	private String emailId;
	private double password;

	public Customer(int id, String name, String emailId, double password) {
		super();
		this.id = id;
		this.name = name;
		this.emailId = emailId;
		this.password = password;
	}

	public Customer() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public double getPassword() {
		return password;
	}

	public void setPassword(double password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", emailId=" + emailId + ", password=" + password + "]";
	}

}
