package com.aurionpro.test;

import com.aurionpro.model.*;
import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account[] accounts = { new Account(1, "Ram", 1000, AccountType.CURRENT),
				new Account(2, "Sita", 2000, AccountType.SAVINGS), new Account(3, "Laxman", 3000, AccountType.CURRENT),
				new Account(4, "Hanuman", 4000, AccountType.SAVINGS),
				new Account(5, "Mahesh", 5000, AccountType.CURRENT), new Account(6, "Gauri", 6000, AccountType.SAVINGS),
				new Account(7, "Ganesh", 7000, AccountType.CURRENT),
				new Account(8, "Siddhi", 8000, AccountType.SAVINGS),
				new Account(9, "Riddhi", 9000, AccountType.CURRENT),
				new Account(10, "Krishna", 10000, AccountType.SAVINGS), };

		// for(Account acc : accounts) {
		// System.out.println(acc);
		// }

		Account highestBalanceAccount = findHighestBalanceAccount(accounts);
		System.out.println("Account woth Highest Balance : " + highestBalanceAccount);

		Account highestCurrentBalanceAccount = findHighestBalanceAccountInAccountType(accounts, AccountType.CURRENT);
		System.out.println("Highest Balance in Current Account : " + highestCurrentBalanceAccount);

		Account highestSavingsBalanceAccount = findHighestBalanceAccountInAccountType(accounts, AccountType.SAVINGS);
		System.out.println("Highest Balance in Savings Account : " + highestSavingsBalanceAccount);

		double sumofAllAccounts = findSumBalanceAccount(accounts);
		System.out.println("Account woth Highest Balance : " + sumofAllAccounts);

		double sumofAccountsBalance = findSumBalanceAccountType(accounts, AccountType.SAVINGS);
		System.out.println("Account with Savings Highest Balance : " + sumofAccountsBalance);
		
		double sumofAccountsBalance1 = findSumBalanceAccountType(accounts, AccountType.CURRENT);
		System.out.println("Account with Current Highest Balance : " + sumofAccountsBalance1);
		
		sortAccountsArrayBySalary(accounts);
		for (int i = 0; i < accounts.length; i++) {
			System.out.println("Sorted Account :\n "+accounts[i]);
		}
		

	}
	
	private static void sortAccountsArrayBySalary(Account[] accounts) {
		Account temp = null;
		for(int i = 0; i <accounts.length; i++) {
			for (int j = 0; j <accounts.length-1; j++) {
				if (accounts[i].getBalance() < accounts[j].getBalance()) {
					temp = accounts[i];
					accounts[i] = accounts[j];
					accounts[j] = temp;
				}
			}
			
		}
	}

	private static double findSumBalanceAccountType(Account[] accounts, AccountType type) {
		// TODO Auto-generated method stub
		double sum = 0;
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getAccountType().equals(type)) {
				sum += accounts[i].getBalance();
			}
		}
		return sum;
	}

	private static double findSumBalanceAccount(Account[] accounts) {
		// TODO Auto-generated method stub
		double sum = 0;
		for (int i = 0; i < accounts.length; i++) {
			sum += accounts[i].getBalance();
		}
		return sum;
	}

	private static Account findHighestBalanceAccount(Account[] accounts) {
		Account maxAccount = accounts[0];

		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getBalance() > maxAccount.getBalance()) {
				maxAccount = accounts[i];
			}
		}
		return maxAccount;
	}

	private static Account findHighestBalanceAccountInAccountType(Account[] accounts, AccountType type) {
		Account maxAccount = null;

		for (int i = 0; i < accounts.length; i++) {
			if (maxAccount == null && accounts[i].getAccountType().equals(type)) {
				maxAccount = accounts[i];
			}

			if (maxAccount != null) {
				if (accounts[i].getBalance() > maxAccount.getBalance() && accounts[i].getAccountType().equals(type)) {
					maxAccount = accounts[i];
				}
			}
		}
		return maxAccount;
	}

	// private static void setAccountDetails(Account account) {
	// Scanner sc = new Scanner(System.in);
	// System.out.println("Enter the ID : ");
	// account.setId(sc.nextInt());
	//
	// System.out.println("Enter the Name :");
	// account.setName(sc.next());
	//
	// System.out.println("Enter the Balance :");
	// account.setBalance(sc.nextInt());
	//
	// System.out.println("Enter the Account Type :");
	// try {
	// account.setAccountType(AccountType.valueOf(sc.next().toUpperCase()));
	// } catch (Exception e) {
	// account.setAccountType(AccountType.SAVINGS);
	// }
	//
	// }
	//
	// private static void printDetails(Account account) {
	// System.out.println("Account Id : " + account.getId());
	// System.out.println("Account Name : " + account.getName());
	// System.out.println("Account Balance : " + account.getBalance());
	// System.out.println("Account Type : " + account.getAccountType());
	//
	// }
	//
	//

}
