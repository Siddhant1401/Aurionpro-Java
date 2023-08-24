package com.aurionpro.model;

public class PrintCharacter implements Runnable{

	@Override
	public void run() {
		for (int i = 'A'; i < 'L'; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
			System.out.println((char)i);
		}
	}
	
	
}
