>package com.aurionpro.model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class EmployeeManagement {
	List<Employee> empDetails = new ArrayList<Employee>();
	static final String filepath = "D:\\Codes\\Eclipse-Wrokspace\\61-Tests\\data.txt";

	// public void EmployeeManagement() {
	// empDetails = new ArrayList<Employee>();
	// loadEmpData();
	// }
	public void loadData() {
		loadEmpData();
	}

	public void convertToEmpObj() {
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\tanish.batham\\Downloads\\emp.txt"));
			String line = br.readLine();
			Double commission;
			int managerID;
			while (line != null) {
				String[] arr = line.split(",");
				if (arr.length == 8) {
					// for (String string : arr) {
					// System.out.println(string);
					// }
					int empID = Integer.parseInt(arr[0].trim().replaceAll("\"", ""));
					String name = arr[1].trim().replace("\"", "");
					String role = arr[2].trim().replace("\"", "");
					if (arr[3].equalsIgnoreCase("null")) {
						managerID = 0;
					} else {
						managerID = Integer.parseInt(arr[3].trim().replaceAll("\"", ""));
					}
					String date = arr[4].trim().replace("\"", "");
					if (arr[6].equalsIgnoreCase("null")) {
						commission = (double) 0;
					} else {
						commission = Double.parseDouble(arr[6].trim().replace("\"", ""));
					}
					double salary = Double.parseDouble(arr[5].trim().replace("\"", ""));
					int departmentID = Integer.parseInt(arr[7].trim().replace("\"", ""));
					empDetails.add(new Employee(empID, name, role, managerID, date, salary, commission, departmentID));
					System.out.println(empDetails);
					// System.out.println(key +value1 +value2);
					// System.out.println("done");
				}
				line = br.readLine();

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void serializeData() {
		try {
			FileOutputStream file = new FileOutputStream(filepath);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(empDetails);
			out.close();
			file.close();

			// System.out.println("Object has been serialized");
			loadEmpData();

		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}
	}

	private void loadEmpData() {
		// TODO Auto-generated method stub
		try {

			FileInputStream file = new FileInputStream(filepath);
			ObjectInputStream in = new ObjectInputStream(file);

			empDetails = (List<Employee>) in.readObject();

			in.close();
			file.close();
		}

		catch (IOException ex) {
			System.out.println("IOException is caught");
		}

		catch (ClassNotFoundException ex) {
			System.out.println("ClassNotFoundException" + " is caught");
		}
	}

	public void getAllEmp() {

		loadEmpData();
		for (Employee employee : empDetails) {
			System.out.println(employee);
		}
	}

	public void getAllFromDepartment() {
		loadEmpData();
		System.out.println("Enter department id:");
		Scanner userin = new Scanner(System.in);
		int userinput = userin.nextInt();
		for (Employee employee : empDetails) {
			if (employee.getDepartmentID() == userinput) {
				System.out.println(employee);
			}
		}
	}

	public void countOfEmpInEachDepartment() { 
  int countOF30=0; 
  int countOF20=0; 
  int countOF10=0; 
  loadEmpData(); 
  for (Employee employee : empDetails) { 
   if(employee.getDepartmentID()==30) { 
    countOF30++; 
   } 
   else if(employee.getDepartmentID()==20) { 
    countOF20++; 
   } 
   else if(employee.getDepartmentID()==10) { 
    countOF10++; 
   } 
  } 
  System.out.println("In department 30

> Tanish Batham:
there are "+countOF30+" in 20 "+countOF20+" and in 10 "+countOF10); 
 }

	public void addNewEmp() {
		System.out.println("Enter Emp ID");
		Scanner userin = new Scanner(System.in);
		int empID = userin.nextInt();
		userin.nextLine();
		System.out.println("Enter name");
		String name = userin.nextLine();
		System.out.println("Enter role");
		String role = userin.nextLine();
		System.out.println("Enter manager ID");
		int managerID = userin.nextInt();
		userin.nextLine();
		System.out.println("Enter doj");
		String date = userin.nextLine();
		System.out.println("Enter salary");
		double salary = userin.nextDouble();
		// userin.nextLine();
		System.out.println("Enter Commission");
		double commission = userin.nextDouble();
		System.out.println("Enter department id");
		int department = userin.nextInt();

		empDetails.add(new Employee(empID, name, role, managerID, date, salary, commission, department));
		serializeData();

	}

	public void deleteEmp() {
		loadEmpData();
		Scanner userin = new Scanner(System.in);
		System.out.println("Enter emp ID to delete");
		int userinput = userin.nextInt();
		for (int i = 0; i < empDetails.size(); i++) {
			if (empDetails.get(i).getEmployeeID() == userinput) {
				empDetails.remove(i);
				System.out.println("Removed");
			}

		}
		serializeData();
	}

	public void getManagerOfEmp() {
		loadEmpData();
		Employee temp = null;
		System.out.println("Enter Employee ID to get manager info");
		Scanner userin = new Scanner(System.in);
		int userinput = userin.nextInt();
		for (Employee employee : empDetails) {
			if (employee.getEmployeeID() == userinput) {
				temp = employee;
			}
		}
		for (Employee employee : empDetails) {
			if (employee.getEmployeeID() == temp.getManagerID()) {
				System.out.println(employee);
			}
		}
	}

	public void highestPiad() {
		loadEmpData();
		Employee employee = empDetails.stream().max(Comparator.comparingDouble(Employee::getSalary)).get();

		System.out.println(employee);
	}

	public void highestPaidForEachRole() {
		loadEmpData();

	}
}
