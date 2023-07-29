package com.aurionpro.model;

import java.time.LocalDate;

public class Bike extends Vehicle implements IMovable {

	public Bike() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bike(String model, LocalDate dom) {
		super(model, dom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
System.out.println("Bike is Moving");		
	}

	@Override
	public void showTopSpeed() {
System.out.println("Top Speed for bike is 120 KMPH");		
	}

}
