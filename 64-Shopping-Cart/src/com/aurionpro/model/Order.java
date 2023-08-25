package com.aurionpro.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

	private int id;
	private Date date;
	List<LineItem> items;

	public Order(int id, Date date, List<LineItem> items) {
		super();
		this.id = id;
		this.date = date;
		this.items = items;
	}
	
	public Order() {
		items = new ArrayList<LineItem>();
	}
	
	public void addLineItem(LineItem item) {
		items.add(item);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public List<LineItem> getItems() {
		return items;
	}

	public void setItems(List<LineItem> items) {
		this.items = items;
	}
	
	@Override
	public String toString() {
		return "Order [id=" + id + ", date=" + date + ", items=" + items + "]";
	}

	public double calculateOrderPrice() {
		double finalOrderPrice = 0;
		for (LineItem lineItem : items) {
			finalOrderPrice += lineItem.calculateItemCost();
		}
		return finalOrderPrice;
	}

}
