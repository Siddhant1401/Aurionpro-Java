package com.aurionpro.test;

import com.aurionpro.model.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeTest {

	public static void main(String[] args) {

		List<Employee> employeeList = Arrays.asList(new Employee(101, "Ram", 50000, "HR"),
				new Employee(102, "Sita", 50000, "HR"), new Employee(103, "Laxman", 30000, "DEVELOPER"),
				new Employee(104, "Ganesh", 90000, "IT INFRA"), new Employee(105, "Riddhi", 60000, "DEVELOPER"),
				new Employee(106, "Siddhi", 70000, "ADMIN"), new Employee(107, "Mahadev", 30000, "ADMIN"),
				new Employee(108, "Gauri", 20000, "DEVELOPER"), new Employee(109, "Kartik", 10000, "HR"),
				new Employee(110, "Durga", 400000, "HR"));

		// List<Employee> collect = employeeList.stream()
		// .filter((employee) ->
		// employee.getDepartment().equalsIgnoreCase("HR")).collect(Collectors.toList());
		//
		// System.out.println("Department Based on HR");
		// collect.forEach(System.out::println);
		// System.out.println(" ");
		//
		// List<Employee> collect1 = employeeList.stream()
		// .filter((employee) ->
		// employee.getDepartment().equalsIgnoreCase("ADMIN")).collect(Collectors.toList());
		//
		// System.out.println("Department Based on ADMIN");
		// collect1.forEach(System.out::println);
		// System.out.println(" ");
		//
		// List<Employee> collect2 = employeeList.stream()
		// .filter((employee) -> employee.getDepartment().equalsIgnoreCase("DEVELOPER"))
		// .collect(Collectors.toList());
		//
		// System.out.println("Department Based on DEVELOPER");
		// collect2.forEach(System.out::println);
		// System.out.println(" ");
		//
		// List<Employee> collect3 = employeeList.stream()
		// .filter((employee) -> employee.getDepartment().equalsIgnoreCase("IT INFRA"))
		// .collect(Collectors.toList());
		//
		// System.out.println("Department Based on IT INFRA");
		// collect3.forEach(System.out::println);
		// System.out.println(" ");
		//
		// Map<String, List<Employee>> collect4 = employeeList.stream()
		// .collect(Collectors.groupingBy(Employee::getDepartment));
		//
		// collect4.forEach((key, value) -> {
		// System.out.println(key + " " + value);
		// });

		List<Employee> maxSalary = employeeList.stream()
				.sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).limit(1)
				.collect(Collectors.toList());
		System.out.println("Employee with Maximum Salary : ");
		maxSalary.forEach(System.out::println);
		System.out.println("                                                      ");

		List<Employee> minSalary = employeeList.stream().sorted(Comparator.comparingDouble(Employee::getSalary))
				.limit(1).collect(Collectors.toList());
		System.out.println("Employee with Minimum Salary : ");
		minSalary.forEach(System.out::println);
		System.out.println("                                                      ");

		List<Employee> collect = employeeList.stream().filter((employee) -> employee.getSalary() > 50000)
				.collect(Collectors.toList());
		System.out.println("Salary Greater than 50000" + collect);

		Double collect2 = employeeList.stream().collect(Collectors.summingDouble(Employee::getSalary));
		System.out.println(collect2);

		long count = employeeList.stream().filter(emp -> emp.getSalary() > 50000).count();
		System.out.println(count);
	}

}
