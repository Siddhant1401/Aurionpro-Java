package com.aurionpro.model;

public class CurrentAccount extends Account {

	private static double over_draft = -25000;

	public CurrentAccount(int id, String name, double balance) {
		super(id, name, balance);
	}

	public boolean withdraw(double amount, CurrentAccount account) {
		if (balance - amount > - over_draft) {
			balance-=amount;
			return true;
		} 
		return false;
	}

}
