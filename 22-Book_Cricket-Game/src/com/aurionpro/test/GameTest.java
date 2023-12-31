package com.aurionpro.test;

import com.aurionpro.model.*;

import java.util.Random;
import java.util.Scanner;

public class GameTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Game player1 = new Game();
		Game player2 = new Game();

		Random random = new Random();

		int round1 = 0;

		System.out.println("Enter 1 to Start Game and 0 to Exit : ");
		String start = sc.next();
		if (start.equals("0")) {
			System.out.println("Game End!!");
		} else {
			System.out.println("Enter Player 1 Name : ");
			player1.setName(sc.next());

			System.out.println("Enter Player 2 Name : ");
			player2.setName(sc.next());

			System.out.println("Player : " + player1.getName());

			do {
				System.out.println("Enter 1 to open the book");
				String input = sc.next();
				if (input.equals("1")) {
					player1.setPageNumber(random.nextInt(300));
					player1.setPoint(player1.getPageNumber() % 7);
					player1.setScore(player1.getPoint() + player1.getScore());
					System.out.println("Page Number : " + player1.getPageNumber() + " " + "Point : "
							+ player1.getPoint() + "Score : " + player1.getScore());
					round1++;
				}
			} while (player1.getPoint() != 0);

			int target = player1.getScore() + 1;
			System.out.println(player1.getName() + " Total Score: " + player1.getScore());
			System.out.println(player2.getName() + " takes " + round1 + "rounds");
			System.out.println(player2.getName() + " needs " + target + "in" + round1 + "rounds to win");

			int round2 = 0;

			System.out.println("Player : " + player2.getName());

			do {
				if (player2.getScore() > player2.getScore() || round2 > round1) {
					break;

				} else {
					System.out.println("Enter 1 to open the book");
					String input = sc.next();
					if (input.equals("1")) {
						player2.setPageNumber(random.nextInt(300));
						player2.setPoint(player2.getPageNumber() % 7);
						player2.setScore(player2.getPoint() + player2.getScore());
						System.out.println("Page Number : " + player2.getPageNumber() + " " + "Point : "
								+ player2.getPoint() + "Score : " + player2.getScore());
						round2++;
					}
				}
			} while (player2.getPoint() != 0);
			if (player2.getScore() > player1.getScore()) {
				System.out.println(player2.getName() + "won the match!!!");
			} else {
				System.out.println(player1.getName() + "won the match!!!");
			}

		}
	}

}
