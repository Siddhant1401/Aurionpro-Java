package com.aurionpro.test2;

import com.aurionpro.model.*;

public class StudentTest {
	public static void main(String[] args) {
		Student student = new Student();
		student.id = 101;
		student.name = "Ram";
		student.emailId = "ram@gmail.com";

		System.out.println("ID : " + student.id + ", Name : " + student.name + ", Email Id : " + student.emailId);

	}

}
