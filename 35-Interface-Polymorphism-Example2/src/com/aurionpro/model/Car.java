package com.aurionpro.model;

import java.time.LocalDate;

public class Car extends Vehicle implements IMovable{

	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String model, LocalDate dom) {
		super(model, dom);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		System.out.println("Car is Moving");
	}

	@Override
	public void showTopSpeed() {
		System.out.println("Top speed of car is 100 KMPH");
	}
	
	

}
