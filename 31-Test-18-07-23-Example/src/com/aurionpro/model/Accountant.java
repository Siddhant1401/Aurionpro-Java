package com.aurionpro.model;

public class Accountant extends Employee {
	
	private double hra;
	private double ma;
	
	public Accountant(long employeeId, String name, double basic, double hra, double ma) {
		super(employeeId, name, basic);
		this.hra = hra;
		this.ma = ma;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	public double getMa() {
		return ma;
	}
	public void setMa(double ma) {
		this.ma = ma;
	}
	
	@Override
	public double calculateAnnualCTC(double amount) {
		setHra((amount*25/100)); //2500
		setMa((amount*20/100));//1500
		double annualCTC = amount + getHra()+ getMa();
		return annualCTC;
		
	}
	public Accountant() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Accountant(long employeeId, String name, double basic) {
		super(employeeId, name, basic);
		// TODO Auto-generated constructor stub
	}

}
