package com.aurionpro.model;

public class Parent {
	
	private int value;

	public Parent(int value) {
		super();
		System.out.println("Inside Parent Constructor");
		this.value = value;
	}

	public Parent() {
		super();
		System.out.println("Inside Parent Constructor");
	}

}
