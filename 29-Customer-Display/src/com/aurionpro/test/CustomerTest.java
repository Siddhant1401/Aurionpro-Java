package com.aurionpro.test;

import com.aurionpro.model.*;
import java.util.Scanner;

public class CustomerTest {
	public static void main(String[] args) {

		Customer[] customers = { new Customer(1, "Ramesh", "ramesh@gmail.com", 123),
				new Customer(2, "Suresh", "suresh@gmail.com", 456), new Customer(3, "Mahesh", "mahesh@gmail.com", 789),
				new Customer(4, "Jayesh", "jayesh@gmail.com", 987), new Customer(5, "Rajesh", "rajesh@gmail.com", 654),
				new Customer(6, "Rakesh", "rakesh@gmail.com", 321), new Customer(7, "Hitesh", "hitesh@gmail.com", 135),
				new Customer(8, "Mitesh", "mitesh@gmail.com", 246), new Customer(9, "Jitesh", "jitesh@gmail.com", 791),
				new Customer(10, "Gitesh", "gitesh@gmail.com", 197) };

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ID, Name, Email and Password: ");
		Customer customer1 = new Customer();
		customer1.setId(sc.nextInt());
		customer1.setName(sc.next());
		customer1.setEmailId(sc.nextLine());
		customer1.setPassword(sc.nextDouble());
		
		validateEmail(customers);
		
		for (int i = 0; i < customers.length; i++) {
			System.out.println(customers[i]);
		}
		
		sortArray(customers);

	}

	private static Customer validateEmail(Customer[] customers) {
		Customer obj = null;
		
		for (int i = 0; i < customers.length; i++) {
			obj = customers[i];
			int atTheRate = obj.getEmailId().indexOf("@");
			int com = obj.getEmailId().indexOf(".com");
			System.out.println(customers[i]);
			
			if(atTheRate != -1 && com != -1) {
				System.out.println("valid Email Id");
			}else {
				System.out.println("Invalid Email Id");
			}
		}
		return obj;
	}
	
	private static Customer validateEmailUserInput(Customer customer) {

		int atTheRate = customer.getEmailId().indexOf("@");
		int com = customer.getEmailId().indexOf(".com");
		System.out.println(customer);
		
		if(atTheRate !=-1 && com!=-1) {
			System.out.println("Valid Email ID");
		}
		else {
			System.out.println("Invalid Email ID!");
		}
			
	
	return customer;
	
}

	private static void sortArray(Customer[] customers) {
		Customer temp = null;
		for (int i = 0; i < customers.length; i++) {
			for (int j = 0; j < customers.length; j++) {
				if(customers[i].getName().compareToIgnoreCase(customers[j].getName())<0) {
					temp = customers[i];
					customers[i] = customers[j];
					customers[j] = temp;
				}
			}
		}
		
		for (int i = 0; i < customers.length; i++) {
			System.out.println(customers[i]);
		}
	}
	

}
