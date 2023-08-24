package com.aurionpro.test;

import com.aurionpro.model.PrintNumber;

public class ThreadTest {

	public static void main(String[] args) {

//		System.out.println("Inside Main");
//		for (int i = 11; i <= 20; i++) {
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			System.out.println("Main Thread "+i);
//		}
		PrintNumber t1 = new PrintNumber();
		t1.setName("Printer 1");
		t1.start();
		t1.setPriority(3);
		System.out.println(t1.getPriority());
		
//		System.out.println("End of  Main");
//		PrintNumber t2 = new PrintNumber();
//		t2.setName("Printer 2");
//		t2.start();
//	
//		System.out.println(Thread.MAX_PRIORITY);
//		System.out.println(Thread.MIN_PRIORITY);
//		System.out.println(Thread.NORM_PRIORITY);
//		System.out.pri);
	}
	
	

}
