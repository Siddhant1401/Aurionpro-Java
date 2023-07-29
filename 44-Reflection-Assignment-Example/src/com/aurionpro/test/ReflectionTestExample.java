package com.aurionpro.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectionTestExample {
	public static void main(String[] args) throws Exception {
		Class<?> myClass = Class.forName(args[0]);

		System.out.println("Name: " + myClass.getName());
		System.out.println("Simple name: " + myClass.getSimpleName());
		System.out.println("Superclass: " + myClass.getSuperclass());
		System.out.println("Interfaces: " + Arrays.toString(myClass.getInterfaces()));
		System.out.println("Is string assignable from Object? " + String.class.isAssignableFrom(Object.class));
		
		System.out.println("                                                                                   ");
		System.out.println("**************************************FEILDS*********************************************");
		System.out.println("                                                                                   ");
		Field[] classFields = myClass.getClass().getDeclaredFields();

		for (Field field : classFields) {
			System.out.println(field);
		}
		
		System.out.println("                                                                                   ");
		System.out.println("***********************************CONSTRUCTORS*********************************************");
		System.out.println("                                                                                   ");
		Constructor[] classconstructors = myClass.getDeclaredConstructors();
        
		for (Constructor constructors : classconstructors) {
			System.out.println(constructors);
		}
		
		System.out.println("                                                                                   ");
		System.out.println("***********************************METHODS*********************************************");
		System.out.println("                                                                                   ");
		Method[] classMethods = myClass.getClass().getDeclaredMethods();
		for (Method method : classMethods) {
			System.out.println(method.getName());

		}
	}
}
