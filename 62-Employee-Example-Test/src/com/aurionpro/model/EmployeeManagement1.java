package com.aurionpro.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class EmployeeManagement1 {
	
	List<Employee> employees = new ArrayList<Employee>();
	
	static final String filepath = "D:\\Aurionpro Java 21\\62-Employee-Example-Test\\emp.txt";
//	public void  EmployeeManagement1() {
//		employees = new ArrayList<Employee>();
//	}
	
	
	
	

	try {

		BufferedReader reader = new BufferedReader(
				new FileReader("D:\\Aurionpro Java 21\\62-Employee-Example-Test\\emp.txt"));
		String line = reader.readLine();
		Double commission;
		int roleId;

		while (line != null) {
			String[] arr = line.split(",");

			int empId = Integer.parseInt(arr[0].trim().replaceAll("\"", ""));
			String empName = arr[1].trim().replace("\"", "");
			String empRole = arr[2].trim().replace("\"", "");
			if (arr[3].equalsIgnoreCase("null")) {
				roleId = 0;
			} else {
				roleId = Integer.parseInt(arr[3].trim().replaceAll("\"", ""));
			}
			String joinDate = arr[4].trim().replace("\"", "");
			if (arr[6].equalsIgnoreCase("null")) {
				commission = (double) 0;
			} else {
				commission = Double.parseDouble(arr[6].trim().replace("\"", ""));
			}
			double salary = Double.parseDouble(arr[5].trim().replace("\"", ""));
			int deptId = Integer.parseInt(arr[7].trim().replace("\"", ""));

			employees.add(new Employee(empId, empName, empRole, roleId, joinDate, salary, commission, deptId));
			System.out.println(line);
		}
		//line = reader.readLine();

	} catch (IOException e) {
		e.printStackTrace();
	}
	
	


}
