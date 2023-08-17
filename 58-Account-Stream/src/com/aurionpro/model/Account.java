package com.aurionpro.model;

public class Account {

	int id;
	String name;
	double balance;
	Gender gender;

	public Account(int id, String name, double balance, Gender gender) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.gender = gender;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
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

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", bankBalance=" + balance + ", gender=" + gender + "]";
	}
}
