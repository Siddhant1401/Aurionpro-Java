package com.aurionpro.model;

public class CurrentAccount extends Account {

	private static double over_draft = 25000;

	public boolean withdraw(double amount, CurrentAccount account) {
		if (account.getBalance() - amount > over_draft) {
			over_draft -= account.getBalance();
		} else {
			return false;
		}
		return true;
	}

}
