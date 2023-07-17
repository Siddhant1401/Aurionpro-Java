package com.aurionpro.model;

public class SavingAccount extends Account {

	private static final double min_balance = 1000;

	
	public boolean withdraw(double amount, SavingAccount account) {
		// TODO Auto-generated method stub
		if(account.getBalance()-amount < min_balance) {
			amount -= account.getBalance();
		}else {
			return false;
		}
		return true;
	}

}
