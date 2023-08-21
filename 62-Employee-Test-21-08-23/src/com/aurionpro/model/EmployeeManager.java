package com.aurionpro.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager {

	List<Employee> employeeLists = new ArrayList<Employee>();

	public void employeeObj() {
		try {
			BufferedReader reader = new BufferedReader(
					new FileReader("D:\\Aurionpro Java 21\\62-Employee-Test-21-08-23\\emp.txt"));
			String line = reader.readLine();

			Double commission;
			int roleId;

			while (line  != null) {
				String[] parts = line.split(",");
				if (parts.length == 8) {
					int empId = Integer.parseInt(parts[0].trim().replaceAll("\"", ""));
					String empName = parts[1].trim().replaceAll("\"", "");
					String empRole = parts[2].trim().replaceAll("\"", "");
					if (parts[3].equalsIgnoreCase("null")) {
						roleId = 0;
					} else {
						roleId = Integer.parseInt(parts[3].trim().replaceAll("\"", ""));

					}
					String joinDate = parts[4].trim();

					if (parts[6].equalsIgnoreCase("null")) {
						commission = (double) 0;
					} else {
						commission = Double.parseDouble(parts[6].trim().replaceAll("\"", ""));
					}
					double salary = Double.parseDouble(parts[5].trim().replaceAll("\"", ""));
					int deptId = Integer.parseInt(parts[7].trim().replaceAll("\"", ""));

					employeeLists
							.add(new Employee(empId, empName, empRole, roleId, joinDate, salary, commission, deptId));
					System.out.println(employeeLists);
				}
				line = reader.readLine();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void getAllEmployees() {
		for (Employee employee : employeeLists) {
			System.out.println(employee);
		}
	}
	
	public void getAllEmployeeFromDeptartment() {
		System.out.println("Enter the Department Id : ");
		
		Scanner sc = new Scanner(System.in);
		int deptidChoice = sc.nextInt();
		for (Employee employee : employeeLists) {
			if(employee.getDeptId() == deptidChoice) {
				System.out.println(employee);
			}
		}
		
	}
}
