package com.aurionpro.test;

import com.aurionpro.model.*;
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account account = new Account(1, "Siddhant", 100000, AccountType.SAVINGS);
		System.out.println(account);
		account.deposit(2000);
		System.out.println(account);
		if (account.withdraw(33000) == true) {
			System.out.println("Transaction is carried out successfully");
			System.out.println(account);
		} else {
			System.out.println("Insufficient Funds");
		}

		// for(Account acc : accounts) {
		// System.out.println(acc);
		// }

	}

}
