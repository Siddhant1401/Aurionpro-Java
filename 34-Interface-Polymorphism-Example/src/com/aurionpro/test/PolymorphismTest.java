package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.IEmotional;
import com.aurionpro.model.IMannerable;
import com.aurionpro.model.Man;

public class PolymorphismTest {
	public static void main(String[] args) {
		Man man = new Man();
		Boy boy = new Boy();

		atTheParty(man);
		atTheParty(boy);

//		atTheMovie(man);
		atTheMovie(boy);
	}

	private static void atTheParty(IMannerable obj) {
		System.out.println("At the Party Hall");
		obj.wish();
		obj.depart();
	}

	private static void atTheMovie(IEmotional obj) {
		System.out.println("At the movie Hall");
		obj.cry();
		obj.lough();
	}
}
