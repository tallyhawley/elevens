package elevens;

public class Card {
	public static final String[] FACES = {"NULL", "ACE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", "TEN", "JACK", "QUEEN", "KING"};
	
	// instance variables
	String suit;

	int face;
	
	// constructor
	public Card(String suit, int face) {
		this.suit = suit;
		this.face = face;
	}
	
	// setters
	public void setSuit(String suit) {
		this.suit = suit;
	}
	
	public void setFace(int face) {
		this.face = face;
	}
	
	// getters
	public String getSuit() {
		return suit;
	}
	
	public int getFace() {
		return face;
	}
	
	// toString method
	public String toString() {
		return FACES[face] + " of " + suit;
	}

}
