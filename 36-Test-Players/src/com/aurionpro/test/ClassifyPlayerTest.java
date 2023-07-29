package com.aurionpro.test;

import com.aurionpro.model.ClassifyPlayer;
import com.aurionpro.model.Players;

public class ClassifyPlayerTest {

	public static void main(String[] args) {
		Players[] player = {new Players(1, "Ram", 1000, 10000, 10),
				new Players(2, "Sita", 120, 122, 34),
				new Players(3, "Laxman", 130, 139, 12),};
		
		Players[] alist = ClassifyPlayer.getALister(player);
		for (int i = 0; i < alist.length; i++) {
			System.out.println(alist[i]);
		}
//		ClassifyPlayer.getBLister(player);
//		ClassifyPlayer.getCLister(player);
	}

}
