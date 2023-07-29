package com.aurionpro.model;

import java.sql.Date;
import java.time.LocalDate;

public class Professor extends Person implements SalariedEmployee {
	private double salary;

	public Professor(int id, String address, LocalDate dob, double salary) {
		super(id, address, dob);
		this.salary = salary;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public double calculateSalary() {
		return ((this.getSalary()*25/100)+(this.getSalary()*15/100)+(this.getSalary()*10/100))*12;
	}

	@Override
	public String toString() {
		return "\n"+super.toString()+"salary=" + salary + "]";
	}
	
	
}
