package elevens;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	public static final int NUMCARDS = 52;
	public static String[] SUITS = "CLUBS HEARTS DIAMONDS SPADES".split(" ");
	
	private List<Card> cards;
	private int top;
	
	// constructor
	public Deck() {
		cards = new ArrayList<Card>();
		top = 51;
		
		for(String suit : SUITS) {
			for(int i = 1; i<=13; i++) {
				cards.add(new BlackJackCard(suit,i));
			}
		}
	}
	
	// deal card
	public Card dealCard() {
		top--;
		return cards.get(top+1);
	}
	
	// shuffle
	public void shuffle() {
		Collections.shuffle(cards);
		top = cards.size() - 1;
	}
		
}
