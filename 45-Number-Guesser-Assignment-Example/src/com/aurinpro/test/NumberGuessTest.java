package com.aurinpro.test;

import com.aurinpro.model.NumberGuess;
import java.util.Scanner;

public class NumberGuessTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		NumberGuess guess = new NumberGuess();

		System.out.println("Guess the Number : ");

		int userInput = sc.nextInt();
		guess.setInput(userInput);
		
		
		//System.out.println("\n The correct answer is " + guess.getNumberls());
		
		
	}
	

}
