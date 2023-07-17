package com.aurionpro.test;
import com.aurionpro.model.*;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SavingAccount account1 = new SavingAccount();
		account1.setId(1);
		account1.setName("Sid");
		account1.setBalance(10000);
		account1.withdraw(2000, account1);
		
		CurrentAccount account2 = new CurrentAccount();
		account2.setId(2);
		account2.setName("Ram");
		account2.setBalance(25000);
		account2.withdraw(3000, account2);
	

	}

}
