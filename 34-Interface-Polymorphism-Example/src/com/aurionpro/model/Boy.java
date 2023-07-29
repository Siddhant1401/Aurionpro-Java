package com.aurionpro.model;

public class Boy implements IMannerable, IEmotional {

	public void greet() {
		System.out.println("Boy says HI!");
	}

	public void depart() {
		System.out.println("Boy says bye!");
	}

	@Override
	public void lough() {
		System.out.println("Boy Laughs!!");
	}

	@Override
	public void cry() {
		System.out.println("Boy cries");
	}

	@Override
	public void wish() {
		System.out.println("Boy is wishing!");
	}

	
}
