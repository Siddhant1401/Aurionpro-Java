package com.aurionpro.model;

import java.util.Arrays;

public class ArrayStatistics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Array Elements : ");
		int arrayElements[] = new int[args.length];
		
		for (int i = 0; i < args.length; i++) {
			arrayElements[i] = Integer.parseInt(args[i]);
			System.out.println(arrayElements[i]);
		}

		sumofArrayElements(arrayElements);
		averageOfArrayElements(arrayElements);
		minArrayElements(arrayElements);
		maxArrayElements(arrayElements);
		meanofArrayElements(arrayElements);
		medianOfArrayElements(arrayElements);
		frequencyOfArrayElements(arrayElements);

	}

	private static void frequencyOfArrayElements(int[] arrayElements) {
		// TODO Auto-generated method stub
		int[] number = new int[arrayElements.length];
		int visited = -1;
		for (int i = 0; i < arrayElements.length; i++) {
			int count = 1;
			for (int j = i + 1; j < arrayElements.length; j++) {
				if (arrayElements[i] == arrayElements[j]) {
					count++;
					number[i] = visited;
				}
			}
			if ((number[i] != visited)) {
				number[i] = count;
			}
		}
		System.out.println("Element | Frequency");
		for (int i = 0; i < number.length; i++) {
			if (number[i] != visited) {
				System.out.println(" " + arrayElements[i] + "|" + number[i]);
			}
		}
	}

	private static void medianOfArrayElements(int[] arrayElements) {
		// TODO Auto-generated method stub
		Arrays.sort(arrayElements);
		int length = arrayElements.length;
		double median = 0;
		if(length%2==1) {
			median = arrayElements[(length+1)/2-1];
		}
		else {
			median = (arrayElements[length/2-1]+arrayElements[length/2])/2;
		}
		System.out.println("Medain of Array Elements : " + median);

	}

	private static void meanofArrayElements(int[] arrayElements) {
		// TODO Auto-generated method stub
		int sum = 0;
		double mean = 0;
		for (int i = 0; i < arrayElements.length; i++) {
			sum += arrayElements[i];
		}
		mean = sum / arrayElements.length;
		System.out.println("Mean of Array Elements :" + mean);

	}

	private static void maxArrayElements(int[] arrayElements) {
		// TODO Auto-generated method stub
		int maximum = Integer.MIN_VALUE;
		for (int i = 0; i < arrayElements.length; i++) {
			if (arrayElements[i] > maximum) {
				maximum = arrayElements[i];
			}
		}
		System.out.println("Maximum Elements in Array Elements " + maximum);
	}

	private static void minArrayElements(int[] arrayElements) {
		// TODO Auto-generated method stub
		int minimum = Integer.MAX_VALUE;
		for (int i = 0; i < arrayElements.length; i++) {
			if (arrayElements[i] < minimum) {
				minimum = arrayElements[i];
			}
		}
		System.out.println("Minimum Element in Array Elements :" + minimum);

	}

	private static void averageOfArrayElements(int[] arrayElements) {
		// TODO Auto-generated method stub
		int sum = 0;
		double avg = 0;
		int length = arrayElements.length;
		for (int i = 0; i < arrayElements.length; i++) {
			sum += arrayElements[i];
		}
		avg = sum / length;
		System.out.println("Average of Array Elements : " + avg);
	}

	private static void sumofArrayElements(int[] arrayElements) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 0; i < arrayElements.length; i++) {
			sum += arrayElements[i];
		}
		System.out.println("Sum of Array Elements : " + sum);
	}

}
