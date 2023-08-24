package com.aurionpro.model;

public class Table implements Runnable{

	public Table() {
		super();
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	private int number;

	public Table(int number) {
		super();
		this.number = number;
	}

	@Override
	public void run() {
		for (int i = 1; i < 11; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(number + " * " + i + " = " + number * i);
		}
	}
	
}
