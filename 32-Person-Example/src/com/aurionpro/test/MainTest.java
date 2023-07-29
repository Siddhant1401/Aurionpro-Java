package com.aurionpro.test;
import java.time.LocalDate;

import com.aurionpro.model.*;

public class MainTest {
	public static void main(String[] args) {
		
		Student s1 = new Student(101, "Pune", LocalDate.of(2001, 12, 12), "IT");
		//getDetails1(s1);
		
		Professor p1 = new Professor(1, "Mumbai", LocalDate.of(2001, 12, 14), 20000);
		//System.out.println(p1.calculateSalary());
		getDetails(p1);
		
		
	}

	private static void getDetails(Professor p1) {
		System.out.println(p1.toString());
		System.out.println("Annual CTC : "+p1.calculateSalary());
	}

}
