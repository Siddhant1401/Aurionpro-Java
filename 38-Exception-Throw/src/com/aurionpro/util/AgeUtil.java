package com.aurionpro.util;

import com.aurionpro.exception.InvalidAgeException;

public class AgeUtil {
	public static void validateAge(int age) {
		if(age >= 18) {
			System.out.println("Valid Age");
		}
		else {
			throw new InvalidAgeException("Invalid Age");
		}
	}
}
