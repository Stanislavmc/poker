package org.poker.enums;

public enum CardRank {
	
	TWO(2),
	THREE(3),
	FOUR(4),
	FIVE(5),
	SIX(6),
	SEVEN(7),
	EIGHT(8),
	NINE(9),
	TEN(10),
	JACK(11),
	QUEEN(12),
	KING(13),
	ACE(14);

	private int cardRank;

	private CardRank(int rank) {
		this.cardRank = rank;
	}

	public int getCardRankNumber() {
		return cardRank;
	}

	public String getShortName() {
		if (cardRank < 10) {
			return String.valueOf(cardRank);
		} else {
			return this.toString().substring(0, 1);
		}
	}
}