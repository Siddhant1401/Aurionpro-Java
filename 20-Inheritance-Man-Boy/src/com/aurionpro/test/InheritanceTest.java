package com.aurionpro.test;

import com.aurionpro.model.Boy;
import com.aurionpro.model.Infant;
import com.aurionpro.model.Man;

public class InheritanceTest {
	public static void main(String[] args) {
		case1();
		System.out.println("-----------------------------");
		case2();
		System.out.println("-----------------------------");
		case3();
		System.out.println("-------------------------------");
		case4();
	}

	private static void case4() {
		// TODO Auto-generated method stub
		Object obj;
		
		obj=10;
		System.out.println(obj.getClass().getSimpleName());
		
		obj="JAVA PROGRAMMING";
		System.out.println(obj.getClass().getSimpleName());
		
		obj=100>200;
		System.out.println(obj.getClass().getSimpleName());
	}

	private static void case1() {
		// TODO Auto-generated method stub
		Man man = new Man();
		man.read();
		man.play();

	}

	private static void case2() {
		// TODO Auto-generated method stub
		Boy boy = new Boy();
		boy.eat();
		boy.read();

	}

	private static void case3() {
		// TODO Auto-generated method stub
		Man man;
		man = new Infant();
		man.read();
		man.play();

	}

}
