package com.aurionpro.test;

import com.aurionpro.model.*;
import java.util.Scanner;

public class PigPlayTest {
	public static void main(String[] args) {

		PigPlay player1 = new PigPlay();
		

		startGame(player1, 1);

	}

	private static void startGame(PigPlay player1, int turn) {

		Scanner sc = new Scanner(System.in);

		int score = 0;
		player1.setTurn(turn);
		boolean roll = true;
		System.out.println("Turn " + player1.getTurn());
		System.out.println("Game Starts");

		while (player1.getTurnScore() <= 20 && roll == true && player1.getTotalScore() < 21) {
			System.out.println("Roll or Hold (r/h) : ");
			String input = sc.next();
			player1.setRollScore(getRandomNumber());

			if (input.equalsIgnoreCase("r") && player1.getRollScore() != 1) {
				score += player1.getRollScore();
				player1.setTotalScore(score);
				System.out.println("Dice : " + player1.getRollScore());
				if (player1.getTotalScore() >= 20) {
					turn++;
				} else if (player1.getRollScore() == 1 && input.equalsIgnoreCase("r")) {
					player1.setTurnScore(0);
					roll = false;
				} else {
					roll = false;
				}
			}
		}
		player1.setTotalScore(player1.getTotalScore());
		if (player1.getTurnScore() == 0) {
			System.out.println("Dice : " + player1.getRollScore());
		}

		if (player1.getTotalScore() < 20) {
			System.out.println("Total Score :  " + player1.getTotalScore());
		}

		if (player1.getTotalScore() >= 20) {
			System.out.println("Total Score :  " + player1.getTotalScore());
			System.out.println("You Won!!");
		}

		if (player1.getTotalScore() < 20) {
			player1.setTurn(turn);
			turn++;
			startGame(player1, turn);
		}
	}

	private static int getRandomNumber() {
		return (int) ((Math.random() * (7 - 1)) + 1);
	}

}
