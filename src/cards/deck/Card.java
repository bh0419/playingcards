package cards.deck;
// PK
public class Card {
	private int rank;
	private char suit;
	
	public Card(int rank, char suit) {
		if(rank >= 1 && rank <= 13) {
			this.rank = rank;
			this.suit = suit;	
		}
	}
	
	public int getRank() {
		return this.rank;
	}
	
	public char getSuite() {
		return this.suit;
	}
	
	public String getRankName() {
		String rank = "";
		
		switch(this.rank) {
			case 1:
				rank = "Ace";
				break;
			case 2:
				rank = "Two";
				break;
			case 3:
				rank = "Three";
				break;
			case 4:
				rank = "Four";
				break;
			case 5:
				rank = "Five";
				break;
			case 6:
				rank = "Six";
				break;
			case 7:
				rank = "Seven";
				break;
			case 8:
				rank = "Eight";
				break;
			case 9:
				rank = "Nine";
				break;
			case 10:
				rank = "Ten";
				break;
			case 11:
				rank = "Jack";
				break;
			case 12:
				rank = "Queen";
				break;
			case 13:
				rank = "King";
				break;
		}
		
		return rank;
	}
	
	public String getSuitName() {
		String suit = "";
		
		switch(this.suit) {
			case 'D':
				suit = "Diamonds";
				break;
			case 'C':
				suit = "Clubs";
				break;
			case 'H':
				suit = "Hearts";
				break;
			case 'S':
				suit = "Spades";
				break;
		}
		
		return suit;
	}
	
	public boolean equals(Card card) {
		return (this.rank == card.rank && this.suit == card.suit);
	}
	
	public String toString() {
		return this.getRankName() + " of " + this.getSuitName();
	}
}