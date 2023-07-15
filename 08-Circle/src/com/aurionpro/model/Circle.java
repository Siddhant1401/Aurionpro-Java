package com.aurionpro.model;

public class Circle {
	private double radius;
	private Color colorType;
	private Border borderType;

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setColor(Color color) {
		this.colorType = color;
	}

	public Color getColor() {
		return colorType;
	}

	public void setBorder(Border border) {
		this.borderType = border;
	}

	public Border getBorder() {
		return borderType;
	}

	public double calculateArea() {
		double area = Math.PI * radius * radius;
		// System.out.println("Area of Circle : "+area);
		return area;
	}

	public double calculatePerimeter() {
		double perimeter = 2 * Math.PI * radius;
		// System.out.println("Perimeter of Circle : "+perimeter);
		return perimeter;
	}
}
