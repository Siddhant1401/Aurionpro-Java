package com.aurionpro.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Employee implements Serializable {

	private static final long serVersionUID = 1L;

	private int empId;
	private String empName;
	private String empRole;
	private int roleId;
	private LocalDate joinDate;
	private double salary;
	private double commission;
	private int deptId;

	public Employee(int empId, String empName, String empRole, int roleId, double salary, double commission,
			int deptId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empRole = empRole;
		this.roleId = roleId;
		// this.joinDate = joinDate;
		this.salary = salary;
		this.commission = commission;
		this.deptId = deptId;
	}

	public Employee() {

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

	public LocalDate getjoinDate() {
		return joinDate;
	}

	public void setjoinDate(LocalDate joinDate) {
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

	public static long getServersionuid() {
		return serVersionUID;
	}

	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		result = prime * result + ((empRole == null) ? 0 : empRole.hashCode());
		result = prime * result + roleId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		if (empName == null) {
			if (other.empName != null)
				return false;
		} else if (!empName.equals(other.empName))
			return false;
		if (empRole == null) {
			if (other.empRole != null)
				return false;
		} else if (!empRole.equals(other.empRole))
			return false;
		if (roleId != other.roleId)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "\n Employee [empId=" + empId + ", empName=" + empName + ", empRole=" + empRole + ", roleId=" + roleId
				+ ", joinDate=" + joinDate + ", salary=" + salary + ", commission=" + commission + ", deptId=" + deptId
				+ "]" + "\n";
	}

}
