package com.aurionpro.test;

public class PassValue {
	public static void main(String[] args) {
		int number = 1;
		System.out.println("Number = "+number);
		
		incrementNumber(number);
		System.out.println(number);
	}

	private static void incrementNumber(int number) {
	number += 10;
	System.out.println();
}
}
