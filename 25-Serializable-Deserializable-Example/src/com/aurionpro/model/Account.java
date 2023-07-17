package com.aurionpro.model;

import java.io.Serializable;

public class Account implements Serializable{

	private static final long serialVersionUID = 1L;
	protected int id;
	protected String name;
	protected double balance;

	public Account(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
	}

	// public int getId() {
	// return id;
	// }
	//
	// public void setId(int id) {
	// this.id = id;
	// }
	//
	// public String getName() {
	// return name;
	// }
	//
	// public void setName(String name) {
	// this.name = name;
	// }
	//
	// public double getBalance() {
	// return balance;
	// }
	//
	// public void setBalance(double balance) {
	// this.balance = balance;
	// }
	//
	public boolean withdraw(double amount) {
		if(amount < 0) {
			return false;
		}
		balance+=amount;
		return true;
	}
	
	public boolean deposit(double amount) {
		if(amount < 0) {
			return false;
		}
		balance+=amount;
		return true;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + "]";
	}

}
