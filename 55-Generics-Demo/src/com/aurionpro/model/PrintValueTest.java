package com.aurionpro.model;

import java.util.Arrays;
import java.util.List;

public class PrintValueTest {

	public static void main(String[] args) {
		PrintValue<Integer> obj1 = new PrintValue<Integer>(10);
		obj1.print();

		PrintValue<Double> obj2 = new PrintValue<Double>(100.90);
		obj2.print();

		PrintValue<Rectantagle> obj3 = new PrintValue<Rectantagle>(new Rectantagle(10, 20));
		obj3.print();

		PrintValue<Float> obj4 = new PrintValue<Float>(2.9f);
		obj4.print();

		PrintValue<Float> obj5 = new PrintValue<Float>((float) 2.5);
		obj5.print();

		printValues(10, "Dinesh");
		
		List<Integer> inList = Arrays.asList(10,20,30,40,50);
		printList(inList);
	}

	private static void printList(List<Integer> inList) {
		for (Integer x : inList) {
			System.out.println(x);
		}
	}

	private static <T,S> void printValues(T value1, S value2) {
		System.out.println(value1 + " " + value2);
	}

}
