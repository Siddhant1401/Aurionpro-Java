package com.aurionpro.test2;

import com.aurionpro.model.*;

public class RecantageTest {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(-100);
		rectangle.setWidth(300);

		System.out.println(rectangle.getHeight() * rectangle.getWidth());

		// Rectangle rectangle1 = new Rectangle();

		// rectangle.height = 10;
		// rectangle.width = 20;
		// rectangle.calculateArea();
		//
		// rectangle1.height = 20;
		// rectangle1.width = 20;
		// rectangle1.calculateArea();

	}

}
