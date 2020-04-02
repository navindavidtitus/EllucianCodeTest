package com.ellucian.task1;

import java.util.Comparator;

public class PlayersComparator implements Comparator<Players> {

	@Override
	public int compare(Players p1, Players p2) {

		if (p1.runScored > p2.runScored) {
			return -1;
		} else if (p1.runScored < p2.runScored) {
			return 1;
		} else {
			return p1.playerName.compareTo(p2.playerName);
		}
	}
}
