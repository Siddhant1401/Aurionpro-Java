package com.aurionpro.test;
import java.awt.ItemSelectable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.aurionpro.model.*;

public class CustomerTest {
	
	public static void main(String[] args) {
		
		Product product1 = new Product(1, "Bat", 100, 20);
		Product product2 = new Product(2, "Ball", 200, 10);
		Product product3 = new Product(3, "Doll", 300, 40);
		Product product4 = new Product(4, "Car", 400, 60);
		Product product5 = new Product(5, "Train", 500, 50);
		
		LineItem lineItem = new LineItem(1, 2, product1);
		Order order = new Order(1, new Date(), Arrays.asList(lineItem));
//		order1.addLineItem(new LineItem(2, 2, product2));
		Customer customer1 = new Customer(1, "Sid", Arrays.asList(order));
		
		// System.out.println(lineItem);
		// System.out.println(order);
		// System.out.println(customer1);
				
		System.out.println("Discounted Price : "+product1.calculateDiscountedPrice());
		System.out.println("Item Cost : "+lineItem.calculateItemCost());
		System.out.println("Order Price : "+order.calculateOrderPrice());
		
	}

}
