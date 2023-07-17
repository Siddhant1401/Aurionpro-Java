package com.aurionpro.model;

public class LongestSequence {
	
	public static void main(String[] args) {
		int count = 1;
		char longChar = ' ';
		int maxCount = 0;
		
		String str = "SSiddhantSSandeepGunjal";
		
		for (int i = 0; i < str.length()-1; i++) {
			char firstChar = str.charAt(i);
			
			if(firstChar == str.charAt(i+1)) {
				count++;
				if(maxCount < count) {
					longChar = firstChar;
					maxCount= count;
				}
			}
			else {
				count=1;
			}
		
		}
		System.out.println("Longest Sequence " +longChar+ " Count : "+maxCount);
	}

}
