package com.aurionpro.model;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class AccountDesrializeTest {

	public static void main(String[] args) {
		//Account account = new Account(1, "Raj", 20000);

		try {
			FileInputStream file = new FileInputStream("D:\\serialize\\test.txt");
			ObjectInputStream in = new ObjectInputStream(file);
			Account acc = (Account)in.readObject();
			
			in.close();
			file.close();
			System.out.println(acc);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
