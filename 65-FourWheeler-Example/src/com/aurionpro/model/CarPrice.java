package com.aurionpro.model;

public class CarPrice extends FourWheeler {

	private int carPrice;

	public CarPrice(String companyName, int mileage, int carPrice) {
		super(companyName, mileage);
		this.carPrice = carPrice;
	}

	@Override
	public String toString() {
		return "CarPrice [carPrice=" + carPrice + "]";
	}

}
