
public class Deck {

	private Card [] cards; // A Deck is an arraoy of Card objects.
	private int topCard;   // This points to the next card to be dealt from the deck.
  /*
   * Here's the constructor for Deck class.  What does a deck of cards look like?
   * 
   */
	Deck() {
		cards = new Card[52];
		int startPosition = 0;
		
		createSuit (Suit.SPADE, 0);
		createSuit( Suit.DIAMOND, 13);
		createSuit(Suit.HEART, 26);
		createSuit(Suit.ClUB, 39);
		
		this.topCard = 0;
	// TODO: Fill in logic to construct a deck of cards by calling the createSuit method one suit at a time. 
	// TODO: Don't forget to initialize topCard variable.
	}
	
	private void createSuit(Suit s, int startPosition) {
		for (int i=2; i < 15; i++) {
			// TODO: Create the individual cards of the suit.
			Card newCard = new Card(s, i);
			this.cards[startPosition++] = newCard;
			
				
			
		}	
	}
	
	public void shuffle() {
		// ATTENTION: here is a line that will generated a random number in the range of 0 to 51 inclusive.
		 int rand = (int) (Math.random() * 52);  // All of these parentheses are absolutely necessary.
		for (i=0; i<52;i++) {
			Card  swap = this.card[i];
			this.card[i] = this.card[rand];
			this.card[rand] = swap;
			
		}
		// TODO: Write an algorithm to shuffle the cards of the deck.
	}
	
	public Card[] deal(int count) {
		if (topCard + count >= 52) {
			throw new IllegalArgumentException("Deck is empty - must resuffle.");
		}
		Card [] d = new Card[count];
		for (i=0;i<count;i++) {
			d[i] = this.card[topCard++]
			
		}
		// TODO: transfer 'count' cards from the deck to the 'd' array which is returned
		//       as the method value.
		return d;
	}
	
	// API for testing only!
	public Card getCard(int which) {
		return cards[which];
	}
	
}
