package com.aurionpro.model;

public class Account {

	private int id;
	private String name;
	private int balance;
	private AccountType accountType;

	public Account(int id, String name, int balance, AccountType accountType) {
		this.id = id;
		this.name = name;
		this.balance = balance;
		this.accountType = accountType;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", balance=" + balance + ", accountType=" + accountType + "]";
	}

	public int getId() {
		return id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public AccountType getAccountType() {
		return accountType;
	}

}
