package com.aurionpro.model;

import java.util.Date;

public class Employee {

	private int empId;
	private String empName;
	private String empRole;
	private int roleId;
	private String joinDate;
	private double salary;
	private double commission;
	private int deptId;

	public Employee(int empId, String empName, String empRole, int roleId, String joinDate, double salary, double commission,
			int deptId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empRole = empRole;
		this.roleId = roleId;
		this.joinDate = joinDate;
		this.salary = salary;
		this.commission = commission;
		this.deptId = deptId;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpRole() {
		return empRole;
	}

	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getCommission() {
		return commission;
	}

	public void setCommission(double commission) {
		this.commission = commission;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empRole=" + empRole + ", roleId=" + roleId
				+ ", joinDate=" + joinDate + ", salary=" + salary + ", commission=" + commission + ", deptId=" + deptId
				+ "]";
	}

}
