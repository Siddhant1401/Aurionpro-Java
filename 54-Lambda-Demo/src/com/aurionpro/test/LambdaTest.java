package com.aurionpro.test;


import com.aurionpro.model.IGreetable;
import com.aurionpro.model.WelcomeGreeting;

public class LambdaTest {

	public static void main(String[] args) {

		WelcomeGreeting obj = new WelcomeGreeting();
		obj.printGreeting();

		IGreetable obj2 = new IGreetable() {

			@Override
			public void printGreeting() {
				System.out.println("Thank you Good Bye");
			}
		};
		obj2.printGreeting();

		IGreetable bye = new IGreetable() {

			@Override
			public void printGreeting() {
				System.out.println("BYEE");
			}
		};
		bye.printGreeting();
	}

}
