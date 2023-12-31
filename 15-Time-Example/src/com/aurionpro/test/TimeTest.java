package com.aurionpro.test;

import com.aurionpro.model.*;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Time time1 = new Time(16, 32, 47);
		Time time2 = new Time(10, 16, 40);

		System.out.println(time1);
		System.out.println(time2);
		
		Time updateTime = addTime(time1, time2);
		System.out.println(updateTime);
	}

	private static Time addTime(Time time1, Time time2) {
		
		
		int updateHours = 0;
		int updateMinutes = 0;
		int updateSeconds = 0;
		int carryforward = 0;
		
		updateSeconds = time1.getSeconds()+time2.getSeconds();
		if(updateSeconds > 60) {
			updateSeconds -= 60;
			carryforward = 1;
		}
		
		updateMinutes = time1.getMinutes()+time2.getMinutes();
		if(updateMinutes > 60) {
			updateMinutes -= 60;
			updateHours += 1;
		}
		
		updateHours = time1.getHours()+time2.getHours();
		if(updateHours > 23) {
			updateHours -= 24;
		}
		
		Time tempTime = new Time(updateHours, updateMinutes, updateSeconds);
		return tempTime;
	}

}
