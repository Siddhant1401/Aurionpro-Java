package com.aurionpro.model;

public class Account {

	private int id;
	private String name;
	private final int balance;
	private AccountType accountType;

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

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public Account(int id, String name, int balance, AccountType accountType) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.accountType = accountType;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + ", accountType=" + accountType + "]";
	}

	public boolean withdraw(double amount) {
		boolean isvalid = false;
		if (balance - amount > 0) {
			isvalid = true;
			balance -= amount;
		} else {
			isvalid = false;
		}
		return isvalid;
	}

}