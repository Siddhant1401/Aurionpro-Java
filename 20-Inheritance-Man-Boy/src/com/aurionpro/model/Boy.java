package com.aurionpro.model;

public class Boy extends Man {

	public void eat() {
		System.out.println("Boy is Eating");
	}

	@Override
	public void read() {
		System.out.println("Boy is Reading");
	}

}
