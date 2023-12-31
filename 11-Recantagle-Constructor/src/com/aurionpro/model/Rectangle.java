package com.aurionpro.model;

public class Rectangle {
	private double height;
	private double width;
	private Color color;
	
	public Rectangle(double height, double width, Color color) {
		this.height = height;
		this.width = width;
		this.color = color;
	}
	
	public Rectangle() {
		this.height = 10;
		this.width = 20;
		this.color = Color.GREEN;
	}

	public void setHeight(double height) {
		this.height = correctValues(height);
	}

	public void setWidth(double width) {
		this.width = correctValues(width);

	}

	public void setColor(Color color) {
		this.color = color;
		// if (color.equalsIgnoreCase("red") || color.equalsIgnoreCase("blue") ||
		// color.equalsIgnoreCase("green")) {
		// this.color = color;
		// } else {
		// this.color = "Red";
		// }
	}

	private double correctValues(double values) {
		if (values < 1) {
			values = 1;
		} else if (values > 100) {
			values = 100;
		} else {
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

	public Color getColor() {
		return color;
	}

	// public double calculateArea() {
	// double area = height * width;
	// System.out.println(area);
	// return area;
	// }

}
