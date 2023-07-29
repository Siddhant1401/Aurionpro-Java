package com.aurionpro.model;

import java.sql.Date;
import java.time.LocalDate;

public class Student extends Person {
	private String branch;

	public Student(int id, String address, LocalDate dob, String branch) {
		super(id, address, dob);
		this.branch = branch;
	}

	public Student(int id, String address, LocalDate dob) {
		super(id, address, dob);
		// TODO Auto-generated constructor stub
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Student [branch=" + branch + "]";
	};
	
	
}
