package com.aurionpro.model;

public class Rectangle {
	private double height;
	private double width;

	public void setHeight(double height) {
		this.height = correctValues(height);
	}

	public void setWidth(double width) {
		this.width = correctValues(width);
		
	}
	
	private double correctValues(double values) {
		if (values < 1) {
			values = 1;
		}
		else if(values > 100) {
			values = 100;
		}
		else {
			values = values;
		}
		return values;
	}

	public double getHeight() {
		return height;
	}

	public double getWidth() {
		return width;
	}

	// public double calculateArea() {
	// double area = height * width;
	// System.out.println(area);
	// return area;
	// }

}
