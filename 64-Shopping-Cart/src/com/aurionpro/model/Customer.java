package com.aurionpro.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {

	private int id;
	private String name;
	List<Order> orders;

	public Customer() {
		orders = new ArrayList<Order>();
	}

	public void addOrder(Order order) {
		orders.add(order);
	}

	public Customer(int id, String name, List<Order> orders) {
		super();
		this.id = id;
		this.name = name;
		this.orders = orders;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", orders=" + orders + "]";
	}

	public double totalCost() {
		double cost = 0;
		for (Order order : orders) {
			cost += order.calculateOrderPrice();
		}
		return cost;
	}
}
