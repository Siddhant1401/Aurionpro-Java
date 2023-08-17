package com.aurionpro.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Occurrence {

	public static void main(String[] args) {
		
		List<Integer> numberList = Arrays.asList(80,10,10,20,30,40,10,20,50,30,40,80,90,100,20);
		
		Map<Integer, Integer> frequency = new HashMap();
		
		for(Integer x : numberList) {
			if(!frequency.containsKey(x)) {
				frequency.put(x, 1);
			}
			else {
				frequency.put(x, frequency.get(x)+1);
			}
		}
		
		frequency.forEach((key,value)->{
			System.out.println(key + " -> " + value);
		});
		
	}
}
