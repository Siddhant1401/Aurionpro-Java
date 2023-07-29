package com.aurionpro.model;

public class Developer extends Employee {
	
	private double pA;
	private double oT;
	
	public Developer(long employeeId, String name, double basic, double pA, double oT) {
		super(employeeId, name, basic);
		this.pA = pA;
		this.oT = oT;
	}
	
	

	public Developer() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Developer(long employeeId, String name, double basic) {
		super(employeeId, name, basic);
		pA = basic * 40/100;
		oT = basic * 20/100;
	}



	public double getpA() {
		return pA;
	}

	public void setpA(double pA) {
		this.pA = pA;
	}

	public double getoT() {
		return oT;
	}

	public void setoT(double oT) {
		this.oT = oT;
	}
	
	@Override
	public double calculateAnnualCTC() {
//		setpA((amount*40/100)); //2500
//		setoT((amount*20/100));//1500
		return (this.getBasic() + getpA()+ getoT())*12;
		
	}

}
