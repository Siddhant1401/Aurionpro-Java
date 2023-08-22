package com.aurionpro.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class EmployeeManager {

	List<Employee> employeeLists = new ArrayList<Employee>();
	Scanner sc = new Scanner(System.in);

	public void employeeObj() {
		try {
			BufferedReader reader = new BufferedReader(
					new FileReader("D:\\Aurionpro Java 21\\62-Employee-Test-21-08-23\\emp.txt"));
			String line = reader.readLine();

			Double commission;
			int roleId;

			while (line != null) {
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

		int deptidChoice = sc.nextInt();
		for (Employee employee : employeeLists) {
			if (employee.getDeptId() == deptidChoice) {
				System.out.println(employee);
			}
		}

	}

	public void countOfEmployeeInEachDept() {
		int count30 = 0;
		int count20 = 0;
		int count10 = 0;

		for (Employee employee : employeeLists) {
			if (employee.getDeptId() == 30) {
				count30++;
			} else if (employee.getDeptId() == 20) {
				count20++;
			} else if (employee.getDeptId() == 10) {
				count10++;
			}
			System.out.println("Total Employees present in 30 : " + count30 + "\n Total Employees present in 20 : "
					+ count20 + "\n Total Employees present in 10 : " + count10);

		}
	}

	public void deleteEmployee() {
		System.out.println("Enter Employee Id to Delete");
		int deleteChoice = sc.nextInt();
		for (int index = 0; index < employeeLists.size(); index++) {
			if (employeeLists.get(index).getEmpId() == deleteChoice) {
				employeeLists.remove(index);
				System.out.println("Employee Deleted!");
			}
		}
	}

	public void addNewEmployee() {
		System.out.println("Enter Employee Id : ");
		int empId = sc.nextInt();
		System.out.println("Enter Employee Name : ");
		String empName = sc.next();
		System.out.println("Enter Employee Role : ");
		String empRole = sc.next();
		System.out.println("Enter Employee Role Id : ");
		int roleId = sc.nextInt();
		System.out.println("Enter Employee Join Date : ");
		String joinDate = sc.next();
		System.out.println("Enter Employee Salary : ");
		double salary = sc.nextDouble();
		System.out.println("Enter Employee Commission : ");
		double commission = sc.nextDouble();
		System.out.println("Enter Employee Dept Id : ");
		int deptId = sc.nextInt();

		employeeLists.add(new Employee(empId, empName, empRole, roleId, joinDate, salary, commission, deptId));

	}

	public void getEmployeeManager() {
		Employee emp = null;
		System.out.println("Enter Employee Id for Manager Info :");
		int empId = sc.nextInt();
		for (Employee employee : employeeLists) {
			if (employee.getEmpId() == empId) {
				emp = employee;
			}
		}

		for (Employee employee : employeeLists) {
			if (employee.getEmpId() == emp.getRoleId()) {
				System.out.println(employee);
			}
		}
	}

	public void highestPaid() {
		Employee employee = employeeLists.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();
		System.out.println(employee);
	}

	public void highestPaidForEachRole() {
		Employee employee1 = employeeLists.stream().filter(emp -> emp.getEmpRole().equalsIgnoreCase("manager"))
				.max(Comparator.comparingDouble(Employee::getSalary)).get();
		System.out.println("Highest Paid Employee for Manager Role : " + employee1);

		Employee employee2 = employeeLists.stream().filter(emp -> emp.getEmpRole().equalsIgnoreCase("clerk"))
				.max(Comparator.comparingDouble(Employee::getSalary)).get();
		System.out.println("Highest Paid Employee for Clerk Role : " + employee2);

		Employee employee3 = employeeLists.stream().filter(emp -> emp.getEmpRole().equalsIgnoreCase("analyst"))
				.max(Comparator.comparingDouble(Employee::getSalary)).get();
		System.out.println("Highest Paid Employee for Analyst Role : " + employee3);

		Employee employee4 = employeeLists.stream().filter(emp -> emp.getEmpRole().equalsIgnoreCase("salesman"))
				.max(Comparator.comparingDouble(Employee::getSalary)).get();
		System.out.println("Highest Paid Employee for Manager Role : " + employee4);

	}

	public void sumOfAllEmployeeSalaries() {
		double sum = employeeLists.stream().mapToDouble(Employee::getSalary).sum();
		System.out.println("Total Salary : " + sum);
	}

	public void highestCommissionSalesMan() {
		Employee employee = employeeLists.stream().filter(emp -> emp.getEmpRole().equalsIgnoreCase("salesman"))
				.max(Comparator.comparingDouble(Employee::getCommission)).get();
		System.out.println("Highest Commission : " + employee);
	}

	public void highestPaidForEachDept() {
		Employee employee1 = employeeLists.stream().filter(emp -> emp.getDeptId() == 30)
				.max(Comparator.comparingDouble(Employee::getSalary)).get();
		System.out.println("Highest Employee in Dept 30 : " + employee1);

		Employee employee2 = employeeLists.stream().filter(emp -> emp.getDeptId() == 20)
				.max(Comparator.comparingDouble(Employee::getSalary)).get();
		System.out.println("Highest Employee in Dept 20 : " + employee2);

		Employee employee3 = employeeLists.stream().filter(emp -> emp.getDeptId() == 10)
				.max(Comparator.comparingDouble(Employee::getSalary)).get();
		System.out.println("Highest Employee in Dept 10 : " + employee3);
	}

}
