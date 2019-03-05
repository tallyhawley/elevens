package elevens;

public class Runner {
	public static void main(String[] args) {
		// test card
		Card card = new Card("SPADES", 5);
		System.out.println(card);
		card.setSuit("HEARTS");
		card.setFace(12);
		System.out.println(card);
		
		// test deck
		Deck deck = new Deck();
		System.out.println("all cards in order.");
		for(int i = 1; i<=52; i++) {
			System.out.println(deck.dealCard());
		}
		deck.shuffle();
		System.out.println("\n\nall cards after shuffling");
		for(int i = 1; i<=52; i++) {
			System.out.println(deck.dealCard());
		}
	}

}
