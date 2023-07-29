package com.aurionpro.test;
import java.time.LocalDate;
import com.aurionpro.model.*;
import com.aurionpro.model.Vehicle;

public class PolymorphismTest {

	public static void main(String[] args) {
		IMovable[] moveables = { new Car("SUV", LocalDate.of(2023, 12, 12) ),
				new Bike("sport", LocalDate.of(2022, 05, 13)), new Bus("Luxry", LocalDate.of(2021, 03, 20)) };

		
		for (IMovable iMovable : moveables) {
			startMoving(iMovable);
		}
	}

	private static void startMoving(IMovable iMovable) {

		iMovable.move();
//		System.out.println(iMovable);
		Vehicle obj = (Vehicle)iMovable;
		obj.showTopSpeed();
	}

}
