/*
 * Here's a complete Hand class.  All it does is keep track of the cards dealt to a "hand".
 * It also sorts a hand and can show (print) a hand.
 */
public class Hand {

	private Card [] hand;
	
	public Hand(Card [] hand) {
		this.hand = hand;
	}
	
	
	public Card[] getHand() {
		return hand;
	}

	public void sort() {
		java.util.Arrays.sort(hand);
	}
	
	public void show() {
		for (int i = 0; i < hand.length; i++) {
			Card card = getCard(i);
			card.show();
			System.out.print(" ");
		}
		System.out.println();
	}
	
	public Card getCard(int which) {
		if (which < 0 || which > hand.length-1) {
			throw new IllegalArgumentException("Bad index into hand.");
		}
		return hand[which];
	}
	
}
