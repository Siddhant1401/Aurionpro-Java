package com.aurionpro.test;

import com.aurionpro.model.Table;

public class ThreadTest3 {

	public static void main(String[] args) {
		
			Table tableObj = new Table(4);
			Table tableObj1 = new Table(5);
			
			Thread t1 = new Thread(tableObj);
			t1.start();
			
			Thread t2 = new Thread(tableObj1);
			t2.start();
	
	}

}
