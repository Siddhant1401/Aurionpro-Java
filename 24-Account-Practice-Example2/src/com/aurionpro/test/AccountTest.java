package com.aurionpro.test;

import com.aurionpro.model.*;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new SavingAccount(1, "Sita", 100000);
		//printDetails(acc);
		
		SavingAccount account1 = new SavingAccount(1, "Ram", 10000);
		System.out.println(account1);
		printTransactionMessage(account1.deposit(1000));
		System.out.println(account1);
		printTransactionMessage(account1.withdraw(10000));
		
		System.out.println("----------------------------------------------------------");
		
		CurrentAccount account2 = new CurrentAccount(2, "Ram", 10000);
		System.out.println(account2);
		printTransactionMessage(account2.deposit(1000));
		System.out.println(account2);
		printTransactionMessage(account2.withdraw(60000));
			

	}

//	public static void printDetails(Account acc) {
//		System.out.println(acc.id);
//		System.out.println(acc.getName());
//		System.out.println(acc.getBalance());
//		
//	}

	private static void printTransactionMessage(boolean transaction) {
		if (transaction) {
			System.out.println("Transaction Successfull");
		} else {
			System.out.println("Transaction Failed");
		}
	}

}
