package cards.deck;

import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Random;
import java.math.*;

public class Deck {
	ArrayList<Card> DECK = new ArrayList<Card>();
	
	public Deck() {
		this.resetDeck();
	}
	
	private void resetDeck() {
		this.DECK.clear();
		
		for(int i = 0; i < 13; i++) {
			this.DECK.add(new Card(i + 1, 'D'));
			this.DECK.add(new Card(i + 1, 'C'));
			this.DECK.add(new Card(i + 1, 'H'));
			this.DECK.add(new Card(i + 1, 'S'));
		}		
	}
	
	public boolean isInDeck(Card card) {
		
		for(int i = 0; i < this.DECK.size(); i++) {
			if(this.DECK.get(i).equals(card)) {
				return true;
			}
		}
		
		return false;
	}
	
	public boolean isDeckFull() {
		if(this.DECK.size() >= 52) {
			return true;
		}
		
		return false;
	}
	
	public void remove(int position) {
		this.DECK.remove(position);
	}
	
	public void topDeck(Card card) {
		if(!this.isDeckFull() && !this.isInDeck(card)) {
			this.DECK.add(0, card);
		}
	}
	
	public void bottomDeck(Card card) {
		if(!this.isDeckFull() && !this.isInDeck(card)) {
			this.DECK.add(card);
		}
	}
	
	public void reset() {
		this.resetDeck();
	}
	
	public void shuffle() {
		Collections.shuffle(this.DECK);
	}
	
	public Card selectRandomCard() {
		Random r = new Random();
		
		return this.DECK.get(r.nextInt(this.DECK.size() + 1));
	}
	
	public Card[] selectMultipleCards(int number) {
		ArrayList<Card> d = this.DECK;
		Card[] cards = new Card[number];
		
		if(number >= 1 && number <= d.size()) {
			for(int i = 0; i < number; i++) {
				Random rand = new Random();
				int r = rand.nextInt(d.size() + 1);
				cards[i] = d.get(r);
				d.remove(r);
			}
		}
		
		return cards;
	}
	
	public String toString() {
		String display = "[Deck]\n";
		for(int i = 0; i < this.DECK.size(); i++) {
			int num = i + 1;
			display += num +  ": " + this.DECK.get(i) + "\n";
		}
		
		display += "[End Deck]\n";
		
		return display;
	}
}
