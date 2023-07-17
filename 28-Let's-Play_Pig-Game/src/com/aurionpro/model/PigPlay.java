package com.aurionpro.model;

public class PigPlay {

	private int turn;
	private int turnScore;
	private int totalScore;
	private int rollScore;

	public int getTurn() {
		return turn;
	}

	public void setTurn(int turn) {
		this.turn = turn;
	}

	public int getTurnScore() {
		return turnScore;
	}

	public void setTurnScore(int turnScore) {
		this.turnScore = turnScore;
	}

	public int getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(int totalScore) {
		this.totalScore = totalScore;
	}

	public int getRollScore() {
		return rollScore;
	}

	public void setRollScore(int rollScore) {
		this.rollScore = rollScore;
	}

	@Override
	public String toString() {
		return "PigPlay [turn=" + turn + ", turnScore=" + turnScore + ", totalScore=" + totalScore + ", rollScore="
				+ rollScore + "]";
	}

}
