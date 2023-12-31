package com.aurinpro.model;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {

	Scanner sc = new Scanner(System.in);

	Random rm = new Random();

	private int answer = rm.nextInt(11);
	private int userInput;

	public void setInput(int userInput) {
		this.userInput = guessTheNumber(userInput);
	}

	public int getInput() {
		return userInput;
	}

	public int getNumberls() {
		return answer;
	}

	public int guessTheNumber(int userInput) {
		for (int i = 1; i <= 6; i++) {
			if (userInput != answer && userInput < answer) {
				System.out.println("Your Guessed Number " + userInput + " is low. Re-Enter the Higher Number :");
				userInput = sc.nextInt();
			} else if (userInput != answer && userInput > answer) {
				System.out.println("Your Guessed Number " + userInput + " is high. Re-Enter a lower Number :");
				userInput = sc.nextInt();
			} else {
				System.out.println("Your Guessed Number is Right, The Number is : " + userInput);
				break;
			}
		}
		return userInput;
	}

}
