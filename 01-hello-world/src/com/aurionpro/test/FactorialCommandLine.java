package com.aurionpro.test;

public class FactorialCommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter number : "+args[0]);
		int number = Integer.parseInt(args[0]);
		int fact = 1;
		for(int i = 1; i <= number; i++) {
			fact = fact * i;
			}
		System.out.println("Factorial = "+fact);


	}

}
