package com.ellucian.task1;

public class Players {

	String playerName;

	public String getName() {
		return playerName;
	}

	public void setName(String name) {
		this.playerName = name;
	}

	public int getScore() {
		return runScored;
	}

	public void setScore(int score) {
		this.runScored = score;
	}

	int runScored;

	public Players(String playerName, int runsScored) {
		this.playerName = playerName;
		this.runScored = runsScored;
	}

}
