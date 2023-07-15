package com.aurionpro.test;

public class PassByValueRef {

	int[] numbers = { 10, 20, 30, 40, 50 };

	 	 incrementNumberByOne(numbers);
			
			for(int x : numbers) {
				System.out.println(x);
			}
			
		}

	private static void incrementNumberByOne(int[] numbers) {
		// TODO Auto-generated method stub
		/*
		 * for(int x : numbers) { x = x+1;
		 * 
		 * }
		 */

		for (int i = 0; i < numbers.length; i++) {
			numbers[i] += 1;

		}

	}
}
