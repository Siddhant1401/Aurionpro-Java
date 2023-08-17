package com.aurionpro.test;

import com.aurionpro.model.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StudentTest {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student(101, "Ram", 89, Arrays.asList("Reading", "Writing")),
				new Student(102, "Sita", 90, Arrays.asList("Reading", "Dancing", "Cooking")),
				new Student(103, "Laxman", 87, Arrays.asList("Exploring")),
				new Student(104, "Ganesh", 98, Arrays.asList("Eating", "Writing", "Exploring")),
				new Student(105, "Riddhi", 78, Arrays.asList("Reading", "Singing")),
				new Student(106, "Siddhi", 88, Arrays.asList("Cooking", "Writing")),
				new Student(107, "Mahadev", 96, Arrays.asList("Meditating", "Writing")));

		// for (Student student : students) {
		// System.out.println(student);
		// }

		List<Student> maxPercentage = students.stream()
				.sorted(Comparator.comparingDouble(Student::getPercentage).reversed()).limit(3)
				.collect(Collectors.toList());
		System.out.println("Max three top percentage student :");
		maxPercentage.forEach(System.out::println);
		System.out.println("                                      ");

		List<Student> minPercentage = students.stream().sorted(Comparator.comparingDouble(Student::getPercentage))
				.limit(3).collect(Collectors.toList());
		System.out.println("Min percentage student :");
		minPercentage.forEach(System.out::println);
		System.out.println("                                          ");

		List<String> collect = students.stream().map((student) -> student.getHobbies()).flatMap((list) -> list.stream())
				.distinct().collect(Collectors.toList());

		System.out.println(collect);

	}

}
