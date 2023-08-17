package com.aurionpro.test;

import java.util.HashSet;
import java.util.Set;

import com.aurionpro.model.*;
public class AccountTest {

	public static void main(String[] args) {
		
			Account acc1 = new Account(1, "Ram");
			Account acc2 = new Account(2, "Sita");
			Account acc3 = new Account(3, "LAxman");
			
			Set<Account> account  = new HashSet<>();
			account.add(acc1);
			account.add(acc2);
			account.add(acc3);
			
			System.out.println(account);
	}

}
