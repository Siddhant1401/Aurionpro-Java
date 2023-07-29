package com.aurionpro.model;

public class ClassifyPlayer {

	public static Players[] getALister(Players[] player) {

		int count = 0;

		for (Players p : player) {
			if (p.getMatches() > 100 && (p.getRuns() > 5000 || p.getWickets() > 150)) {
				count++;
			}
		}
		Players[] aListers = new Players[count];
		for (int i = 0, j = 0; i < player.length; i++) {
			if ((player[i].getMatches() > 100) && (player[i].getRuns() > 5000 || player[i].getWickets() > 150)) {
				aListers[j++] = player[i];
			}
		}
		return aListers;
	}
	
	public static Players[] getBLister(Players[] player) {

		int count = 0;

		for (Players p : player) {
			if (p.getMatches() > 100 && (p.getRuns() > 5000 || p.getWickets() > 150)) {
				count++;
			}
		}
		Players[] aListers = new Players[count];
		for (int i = 0, j = 0; i < player.length; i++) {
			if ((player[i].getMatches() > 100) && (player[i].getRuns() > 5000 || player[i].getWickets() > 150)) {
				aListers[j++] = player[i];
			}
		}
		return aListers;
	}
	
	

}
