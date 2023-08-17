package com.aurionpro.model;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Scanner;

public class NameDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name :");
		String name = sc.next();

		Map<Integer, String> nameMap = new HashMap<>();

		nameMap.put(1, "Ram");
		nameMap.put(2, "Sita");
		nameMap.put(3, "Laxman");
		nameMap.put(4, "Radha");
		nameMap.put(5, "Dinesh");
		nameMap.put(6, "Ganesh");

		Set<Entry<Integer, String>> entrySet = nameMap.entrySet();

		boolean isExist = false;
		for (Entry x : entrySet) {
			if (name.equals(x.getValue())) {
				nameMap.remove(x.getKey());
				isExist = true;
				break;
			}
		}

		if (!isExist) {
			System.out.println("Not FOund");
			nameMap.forEach((key, value) -> {
				System.out.println(key + " " + value);

			});

		} else {
			nameMap.forEach((key, value) -> {
				System.out.println(key + " " + value);

			});

		}

	}
}
