package com.aurionpro.test2;

import java.util.Scanner;

import org.omg.CORBA.portable.ValueOutputStream;

import com.aurionpro.model.Color;
import com.aurionpro.model.Rectangle;

public class RecantageTest {
	public static void main(String[] args) {

		Rectangle[] rectangles = new Rectangle[2];
		for (int i = 0 ; i < rectangles.length; i++) {
			rectangles[i] = new Rectangle();
			setRectanglevalues(rectangles[i]);
			printRectangle(rectangles[i]);
			System.out.println("");
			System.out.println("**********************************");
			System.out.println("");
		}

		// Rectangle rectangle = new Rectangle();
		// setRectanglevalues(rectangle);
		// printRectangle(rectangle);

		

		// Rectangle rectangle2 = new Rectangle();
		// setRectanglevalues(rectangle2);
		// printRectangle(rectangle2);

		// System.out.println("For Rectangle 2");
		//
		// System.out.println("Enter the Height :");
		// rectangle2.setHeight(sc.nextDouble());
		//
		// System.out.println("Enter the Width : ");
		// rectangle2.setWidth(sc.nextDouble());
		//
		// System.out.println("Enter the Color : ");
		// try {
		// rectangle2.setColor(Color.valueOf(sc.next().toUpperCase()));
		// } catch (Exception e) {
		// rectangle2.setColor(Color.RED);
		// }

		// System.out.println("Area of Rectangle : " + rectangle2.getHeight() *
		// rectangle2.getWidth());
		// System.out.println("Color : " + rectangle2.getColor());
		//
		// Rectangle rectangle1 = new Rectangle();

		// rectangle.height = 10;
		// rectangle.width = 20;
		// rectangle.calculateArea();
		//
		// rectangle1.height = 20;
		// rectangle1.width = 20;
		// rectangle1.calculateArea();
	}

	private static void setRectanglevalues(Rectangle rectangle) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Height :");
		rectangle.setHeight(sc.nextDouble());

		System.out.println("Enter the Width : ");
		rectangle.setWidth(sc.nextDouble());

		System.out.println("Enter the Color : ");
		try {
			rectangle.setColor(Color.valueOf(sc.next().toUpperCase()));
		} catch (Exception e) {
			rectangle.setColor(Color.RED);
		}
	}

	private static void printRectangle(Rectangle rectangle) {
		System.out.println("Area of Rectangle : " + rectangle.getHeight() * rectangle.getWidth());
		System.out.println("Color : " + rectangle.getColor());
	}
}
