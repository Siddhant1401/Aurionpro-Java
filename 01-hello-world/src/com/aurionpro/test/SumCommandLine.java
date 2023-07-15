package com.aurionpro.test;

public class SumCommandLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		
		System.out.println("Sum of Given Numbers : ");
		for (int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
			sum = sum + Integer.parseInt(args[i]);
		}
		System.out.println("Sum: "+sum);

	}

}
