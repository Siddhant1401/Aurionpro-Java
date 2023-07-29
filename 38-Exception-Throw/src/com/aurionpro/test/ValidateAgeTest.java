package com.aurionpro.test;

import com.aurionpro.exception.InvalidAgeException;
import com.aurionpro.util.*;

import java.util.Scanner;

public class ValidateAgeTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Age :");
		int age = sc.nextInt();

		try {
			AgeUtil.validateAge(age);
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}
}
