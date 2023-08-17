package com.aurionpro.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		
		Map<Integer, String> nameMap = new HashMap<>();

		nameMap.put(1, "Ram");
		nameMap.put(2, "Sita");
		nameMap.put(3, "Laxman");
//		nameMap.

		Set<Entry<Integer, String>> entrySet = nameMap.entrySet();

		for (Entry x : entrySet) {
			System.out.println(x.getKey() + " " + x.getValue());
		}
		System.out.println("----------------------------------------------------");
		
		nameMap.forEach((key, value) -> {
			System.out.println(key + " " + value);
		});

	}

}
