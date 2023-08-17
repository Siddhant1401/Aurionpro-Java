package com.aurionpro.model;

public class Rectantagle implements Shape{

	private int height;
	private int width;

	public Rectantagle(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	}

	@Override
	public String toString() {
		return "Rectantagle [height=" + height + ", width=" + width + "]";
	}
	
	

}
