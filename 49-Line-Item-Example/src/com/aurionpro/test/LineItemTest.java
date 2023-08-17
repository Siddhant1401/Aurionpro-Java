package com.aurionpro.test;

import com.aurionpro.model.*;
import java.util.*;

public class LineItemTest {

	public static void main(String[] args) {
		List<LineItem> items = new ArrayList<>();

		items.add(new LineItem(1, "Parle", 5, 20));
		items.add(new LineItem(2, "Mari", 5, 10));
		items.add(new LineItem(3, "Gold", 5, 50));
		items.add(new LineItem(4, "Britania", 5, 60));
		items.add(new LineItem(5, "Nescape", 5, 10));

		double sum = 0;
		for (LineItem x : items) {
			sum += x.getTotalCost();
			System.out.println(x);
		}
		System.out.println("Total Cost : "+sum);
	}

}
