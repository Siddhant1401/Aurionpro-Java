package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.aurionpro.model.Account;
import com.aurionpro.model.Gender;

public class AccountTest {

	public static void main(String[] args) {

		List<Account> accountList = new ArrayList<Account>();

		Collections.addAll(accountList, new Account(1, "Ram", 200000, Gender.Male),
				new Account(2, "Sita", 300000, Gender.Female), new Account(3, "Laxman", 400000, Gender.Male),
				new Account(4, "Hanuman", 500000, Gender.Male), new Account(5, "Ganesh", 600000, Gender.Male),
				new Account(6, "Mahadev", 100000, Gender.Male));

		System.out.println(accountList);

		System.out.println(accountList.get(0).getGender() == (Gender.Male));

		List<Account> femaleList = accountList.stream()
				.filter((account) -> account.getBalance() > 200000 && account.getGender() == (Gender.Female))
				.collect(Collectors.toList());
		System.out.println(femaleList);

		List<Account> maleList = accountList.stream()
				.filter((account) -> account.getBalance() > 100000 && account.getGender() == (Gender.Male))
				.collect(Collectors.toList());
		System.out.println(maleList);

		List<Account> sortedByBalanceList = accountList.stream().sorted(Comparator.comparingDouble(Account::getBalance))
				.collect(Collectors.toList());
		System.out.println("                                                                 ");
		System.out.println("Sorted Balance List : ");
		sortedByBalanceList.forEach(System.out::println);

		List<Account> reversesortedByBalanceList = accountList.stream()
				.sorted(Comparator.comparingDouble(Account::getBalance).reversed()).collect(Collectors.toList());
		System.out.println("                                                                 ");
		System.out.println("Reverse Sorted Balance List : ");
		reversesortedByBalanceList.forEach(System.out::println);

		List<Double> collect = accountList.stream().sorted(Comparator.comparingDouble(Account::getBalance).reversed()).limit(3)
				.map((acc) -> (acc.getBalance())).collect(Collectors.toList());
		
		System.out.println(collect);
	}

}
