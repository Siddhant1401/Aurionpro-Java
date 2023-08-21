package com.aurionpro.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NamesExample {

	public static void main(String[] args) {

		String[] names = { "Jay", "Nimesh", "Mark", "Mahesh", "Ramesh" };

		System.out.println("Print names of first 3 studetns sorted in ascending order");
		List<String> collect = Arrays.stream(names)
				.sorted()
				.limit(3)
				.collect(Collectors.toList());
		collect.forEach((name) -> System.out.println(name));
		System.out.println("                                                           ");

		System.out.println("Print Names in Descending order");
		List<String> collect2 = Arrays.stream(names)
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		collect2.forEach((name) -> System.out.println(name));
		System.out.println("                                                                ");

		System.out.println("Print names of first 3 students sorted in ascending order which contains a ");
		Arrays.stream(names)
		.filter(name -> name.contains("a"))
		.sorted().limit(3)
		.forEach(System.out::println);
		System.out.println("                                                                          ");
	}
}
