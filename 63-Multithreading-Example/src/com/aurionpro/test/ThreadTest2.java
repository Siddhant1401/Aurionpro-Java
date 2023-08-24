package com.aurionpro.test;

import com.aurionpro.model.PrintCharacter;

public class ThreadTest2 {
	public static void main(String[] args) {
		
			PrintCharacter printCharObj = new PrintCharacter();
			Thread t1 = new Thread(printCharObj);
			t1.start();
			
			Runnable runObj = new Runnable() {
				
				@Override
				public void run() {
					for (int i = 0; i < 20; i++) {
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						System.out.println(Thread.currentThread().getName()+" Anonymous ");
					}
				}
			};
			
			Thread t2 = new Thread(runObj);
			t2.start();
			
			
	}

}
