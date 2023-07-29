package com.aurionpro.model;

public class Manager extends Employee {

	private double hra;
	private double da;
	private double ta;

	public Manager(long employeeId, String name, double basic) {
		super(employeeId, name, basic);
		hra = basic * 25/100;
		da = basic * 15/100;
		ta = basic * 10/100;
		
	}

	public Manager(long employeeId, String name, double basic, double hra, double da, double ta) {
		super(employeeId, name, basic);
		this.hra = hra;
		this.da = da;
		this.ta = ta;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getDa() {
		return da;
	}

	public void setDa(double da) {
		this.da = da;
	}

	public double getTa() {
		return ta;
	}

	public void setTa(double ta) {
		this.ta = ta;
	}
@Override
	public double calculateAnnualCTC() {
//		setHra((amount * 25 / 100)); // 2500
//		setDa((amount * 15 / 100));// 1500
//		setTa((amount * 10 / 100));// 1000
		return (this.getBasic() + getHra() + getDa() + getTa())*12;
		

	}

	@Override
	public String toString() {
		return "\n"+super.toString()+"hra=" + hra + ", da=" + da + ", ta=" + ta + "]";
	}

}
