package com.aurionpro.test;

import java.util.Arrays;
import java.util.List;

public class StringStreamExample {

	public static void main(String[] args) {

		String[] names = { "Jayesh", "Nimesh", "Mahesh", "Ramesh" };

		System.out.println("Array and Print Using forEach Loop :- ");
		for (String string : names) {
			System.out.println(string);
		}
		System.out.println("                                            ");

		System.out.println("Using  names.stream().forEach :- ");
		Arrays.stream(names).forEach((name) -> System.out.println(name));
		System.out.println("                                            ");

		System.out.println("Using Arrays.asList(names).forEach");
		List<String> nameslist = Arrays.asList(names);
		nameslist.forEach(name -> System.out.println(name));
		System.out.println("                                                  ");

	
		System.out.println("Using Static Reference Method :- ");
		Arrays.stream(names).forEach(StringStreamExample::printName);
	
	
	}
	
	public static void printName(String name) {
		System.out.println(name);
	}
}
