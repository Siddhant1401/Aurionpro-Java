package com.aurionpro.test;

import com.aurionpro.model.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class StudentTest {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student(1, "Ganesh", 90), new Student(2, "Dinesh", 60),
				new Student(3, "Haresh", 70), new Student(4, "Rakesh", 30), new Student(5, "Mahesh", 20));

		Student maxStudent = students.get(0);
		for (Student x : students) {
			if (x.getPercentage() > maxStudent.getPercentage()) {
				maxStudent = x;
			}
		}
		System.out.println("Highest Percentage");
		System.out.println(maxStudent);
		System.out.println("-------------------------------------------------------------");
		
		students.sort(Comparator.comparingDouble(Student::getPercentage).reversed());
		System.out.println("Sort With High Percentage");
		for(Student x : students) {
			System.out.println(x);
		}
		
		students.sort(Comparator.comparing(Student::getName));
		System.out.println("Sort With Name ");
		for(Student x : students) {
			System.out.println(x);
		}
		
	}
}