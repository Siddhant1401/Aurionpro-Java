package com.aurionpro.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.aurionpro.model.Employee;

public class EmployeeUtil {

	List<Employee> employeeList;
	private static boolean initialLoad = false;

	public EmployeeUtil() {
		this.employeeList = new ArrayList<>();
		loadEmployee();
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	@SuppressWarnings("unchecked")
	private void loadEmployee() {
		if (checkIfFileEmpty() && !initialLoad) {
			employeeList = new EmployeeReader().readEmployeeFromFile("C:\\text\\emp.txt");
			initialLoad = true;
		} else if (!checkIfFileEmpty()) {
			try {
				FileInputStream file = new FileInputStream("C:\\text\\emp-serialize.txt");
				ObjectInputStream in = new ObjectInputStream(file);

				this.employeeList = (List<Employee>) in.readObject();

				in.close();
				file.close();

				System.out.println("Object de-serialized successfully");

			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void addEmployee(Employee employee) {
		employeeList.add(employee);
		saveEmployeeList();
	}

	public void removeEmployee(Employee employee) {
		if (employeeList.contains(employee)) {
			employeeList.remove(employee);
			saveEmployeeList();
		}

	}

	private void saveEmployeeList() {
		try {
			FileOutputStream file = new FileOutputStream("C:\\text\\emp-serialize.txt");
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(employeeList);

			out.close();
			file.close();

			System.out.println("Object serialized successfully");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private boolean checkIfFileEmpty() {
		try {
			FileInputStream file = new FileInputStream("C:\\text\\emp-serialize.txt");
			if (file.read() != -1) {
				return false;
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}

}
