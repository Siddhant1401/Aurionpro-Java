package com.aurionpro.test;

import com.aurinpro.model.*;

public class SalesPersonTest {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		SalesPerson[] persons = { new SalesPerson(1, "Ramesh", City.MUMBAI, 1, 100),
				new SalesPerson(2, "Suresh", City.PUNE, 2, 200), new SalesPerson(3, "Mahes", City.NAGPUR, 3, 400),
				new SalesPerson(4, "Jayesh", City.MUMBAI, 5, 350), new SalesPerson(5, "Rajesh", City.PUNE, 6, 79),
				new SalesPerson(6, "Ganesh", City.NAGPUR, 8, 1000), };

		// for (SalesPerson acc : persons) {
		// System.out.println(acc);
		// }

		SalesPerson highestSalesPerson = findHighestSalesPerson(persons);
		System.out.println("Salesman with Highest Sales : " + highestSalesPerson+ "\n");

		double sumofSalesAmount = findSumOfAllSalesAmount(persons);
		System.out.println("Total Sales of All Salesman : " + sumofSalesAmount+ "\n");

		double sumofSalesByCity = findSumofSalesByCity(persons, City.MUMBAI);
		System.out.println("Total Sales in Mumbai City : " + sumofSalesByCity+ "\n");
		
		double sumofSalesByCity1 = findSumofSalesByCity(persons, City.PUNE);
		System.out.println("Total Sales in Pune City : " + sumofSalesByCity1+ "\n");
		
		double sumofSalesByCity2 = findSumofSalesByCity(persons, City.NAGPUR);
		System.out.println("Total Sales in Nagpur City : " + sumofSalesByCity2+ "\n");
		
		SalesPerson highestSalesInEachCity = findHighestSalesInEachCity(persons, City.MUMBAI);
		System.out.println("Highest Sales in Mumbai City : "+highestSalesInEachCity+ "\n");
		
		SalesPerson highestSalesInEachCity1 = findHighestSalesInEachCity(persons, City.PUNE);
		System.out.println("Highest Sales in Pune City : "+highestSalesInEachCity1);
		
		SalesPerson highestSalesInEachCity2 = findHighestSalesInEachCity(persons, City.NAGPUR);
		System.out.println("Highest Sales in Pune City : "+highestSalesInEachCity2+ "\n");
	}
	
	private static SalesPerson findHighestSalesInEachCity(SalesPerson[] persons, City type) {
		SalesPerson maxSales = null;
		
		for (int i = 0; i < persons.length; i++) {
			if(maxSales == null && persons[i].getCity().equals(type)) {
				maxSales = persons[i];
			}
			
			if(maxSales != null) {
				if(persons[i].getSalesAmount() > maxSales.getSalesAmount() && persons[i].getCity().equals(type)) {
					maxSales = persons[i];
				}
			}
		}
		return maxSales;
	}

	private static double findSumofSalesByCity(SalesPerson[] persons, City type) {
		double sum = 0;
		for (int i = 0; i < persons.length; i++) {
			if (persons[i].getCity().equals(type)) {
				sum += persons[i].getSalesAmount();
			}
		}
		return sum;
		
	}
	
	private static double findSumOfAllSalesAmount(SalesPerson[] persons) {
		double sum = 0;
		for (int i = 0; i < persons.length; i++) {
			sum += persons[i].getSalesAmount();
		}
		return sum;
	}

	private static SalesPerson findHighestSalesPerson(SalesPerson[] persons) {
		SalesPerson maxSales = persons[0];

		for (int i = 0; i < persons.length; i++) {
			if (persons[i].getSalesAmount() > maxSales.getSalesAmount()) {
				maxSales = persons[i];
			}
		}
		return maxSales;
	}

}
