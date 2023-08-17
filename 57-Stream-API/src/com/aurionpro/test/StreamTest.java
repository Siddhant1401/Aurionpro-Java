package com.aurionpro.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {

		String[] names = { "Jay", "Akash", "Anuj", "Rohit", "Ram", "Pooja", "Sita" };
		 List<String> filterName = new ArrayList<String>();
		 for (String name : names) {
			 if (name.length() == 3 || name.length() == 4) {
				 filterName.add(name);
			 }
		 }
		 
		 for (String name : filterName) {
			System.out.println(name);
		}
		
		
		List<String> collectNames = Arrays.stream(names).filter((name)->(name.length()==3||name.length()==4)).collect(Collectors.toList());
		collectNames.forEach((name)->System.out.println(name));

	}

}
