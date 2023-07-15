package com.aurionpro.test;

import com.aurionpro.model.*;

public class CircleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c = new Circle();

		c.setRadius(5);
		c.setColor(Color.BLUE);
		c.setBorder(Border.DASHED);

		System.out.println("Area of Cirle : " + c.calculateArea());
		System.out.println("Perimeter of Circle : " + c.calculatePerimeter());
		System.out.println("Color of Circle : " + c.getColor());
		System.out.println("Border of Circle : " + c.getBorder());
	}

}
