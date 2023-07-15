package com.aurionpro.test;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Numbers : ");
		int number[] = new int[args.length];
		
		for (int i = 0; i < args.length; i++) {
			number[i] = Integer.parseInt(args[i]);
			System.out.println(args[i]);
		}
		
		int largestNumber = number[0];
		int secondLargest = Integer.MIN_VALUE;
		
		for (int i = 1; i < number.length; i++) {
			if(largestNumber < number[i]) {
				secondLargest = largestNumber;
				largestNumber = number[i];
			}
			else if(secondLargest < number[i]) {
				secondLargest = number[i];
			}
		}
		
		System.out.println("Second Largest = "+secondLargest);

	}

}
