package com.aurionpro.test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Iterator;

import com.aurionpro.model.*;

public class CatTest {

	public static void main(String[] args) throws Exception {
		Cat myCat = new Cat("Kitty", 6);

		System.out.println("********************************FEILDS*************************");
		Field[] catFields = myCat.getClass().getDeclaredFields();

		for (Field field : catFields) {
			System.out.println(field);
			// if(field.getName().equals("name")) {
			// field.setAccessible(true);
			// field.set(myCat, "Jimmy");
			// }
		}
		System.out.println("*****************************CONSTRUCTORS*************************");
		Method[] catMethods = myCat.getClass().getDeclaredMethods();
		for (Method method : catMethods) {
			// if (method.getName().equals("meow")) {
			// method.invoke(myCat);
			// }
			System.out.println(method.getName());

		}

		// System.out.println(myCat.getName());
	}

}
