public class Card implements Comparable<Card> {

	private Suit suit;
	private int value;

   /*
    * Here's the Card constructor.  Its caller must pass the card's suit and its numeric value.
    * The allowable values are 2 (deuce) through 14 (ace).  Note that aces are always played high.
    */
	Card(Suit suit, int value) {
		if (suit == null) {
			throw new IllegalArgumentException("Suit cannot be null.");			
		}
		if (value < 2 || value > 14) {
			throw new IllegalArgumentException("Card value is out of range.");
		}
		this.suit = suit;
		this.value = value;
	}
	
  /*
   * Compare two card values.  
   * @see java.lang.Comparable#compareTo(java.lang.Object)
   */
	public int compareTo(Card c2) {
		int valueResult = 0;
		// TODO: Fill in the correct logic here.  This logic is *not* correct!
		if ( this.value < c2.value ) {
			valueResult = -1;
		} else if ( this.value > c2.value ) {
			valueResult = 1;
		}
		
		return valueResult;
	}
	
	public Suit getSuit() {
		return suit;
	}
	
	public int getValue() {
		return value;
	}
	
	public void show() {
		System.out.print(this.toString());
	}

  /*
   * For any custom class you are welcome to provide a 'toString' method for the class.
   * Here's one for Card class.  Use it to print the value of a Card object.
   * @see java.lang.Object#toString()
   */
	public String toString() {
		String sCard = "";
		switch (value) {
	case 2:
	case 3:
	case 4:
	case 5:
	case 6:
	case 7:
	case 8:
	case 9:
	case 10:	sCard = Integer.valueOf(value).toString() + ":";
				break;
	case 11:	sCard = "J:";
				break;
	case 12:	sCard = "Q:";
				break;
	case 13:	sCard = "K:";
				break;
	case 14:	sCard = "A:";
				break;
		}
		return sCard + suit.toString();
	}
	

	
}
