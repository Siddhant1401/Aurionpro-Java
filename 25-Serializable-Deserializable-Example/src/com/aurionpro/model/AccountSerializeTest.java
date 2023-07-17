package com.aurionpro.model;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class AccountSerializeTest {
	public static void main(String[] args) {
		Account[] account = { new Account(1, "Raj", 20000), new Account(2, "Simran", 20000),
				new Account(3, "Rahul", 20000) };

		try {
			for (int i = 0; i < account.length; i++) {
				FileOutputStream file = new FileOutputStream("D:\\serialize\\test.txt");
				ObjectOutputStream out = new ObjectOutputStream(file);
				out.writeObject(account);
				out.close();
				file.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
