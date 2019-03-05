package elevens;

public class BlackJackCard extends Card{

	public BlackJackCard(String suit, int face) {
		super(suit, face);
	}
		
	// getters
	public int getValue() {
		if(getFace() == 1) return 11;
		if(getFace() >= 10) return 10;
		else return getFace();
	}
	
	// toString
	
	public String toString() {
		return super.toString() + " | VALUE: " + getValue();
	}
	
	
}
