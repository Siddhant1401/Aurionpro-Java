package com.aurionpro.test;

import com.aurionpro.model.*;
import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Manager m1 = new Manager(101, "Sid", 15000);
		// System.out.println(m1.calculateAnnualCTC(10000));
		printSalarySlip(m1);

Developer d1 = new Developer(1001, "Ram", 20000);
//		m1.calculateAnnualCTC(10000);
printSalarySlip(d1);

//		Accountant a1 = new Accountant(1111, "Sita", 30000);
//		m1.calculateAnnualCTC(10000);
//		printSalarySlip(m1);

	}

	private static void printSalarySlip(Employee employee) {
		System.out.println(employee.toString());
		System.out.println("Annual CTC : " +employee.calculateAnnualCTC());
		

	}

}
