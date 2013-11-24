import java.util.Set;
import java.util.TreeMap;


public class MainClass {

	public static void main(String[] args) {
    //  Create a deck of cards		
		Deck deck = new Deck();
	//  TODO: See if the deck is properly initialized
	//        Deal 4 different hands of 13 cards each an then show each hand.
	//        Example:  Hand h1 = new Hand(deck.deal(13));
	//        You should see the cards of each suit in ascending order.
	 Hand h1 = new Hand(deck.deal(13));
	 Hand h2 = new Hand(deck.deal(26));
	 Hand h3 = new Hand(deck.deal(39));
	 Hand h4 = new Hand(deck.deal(52))
		
	//  Since the deck has been dealt out let's start over by creating a new Deck
	//  Create a new Deck object.
		Deck deck1 = new Deck();
	//  TODO: now shuffle the cards in this deck.

	//  TODO: now deal 5 cards from the shuffled deck to hand1
	//  TODO: and deal 5 cards from the shuffled deck to hand2
		
	//  TODO: now write a loop that compares the cards of hand1 to those in hand2
	//        card by card.  Use the Card class's compareTo method and print
    //        whether card1 is less than, equal to, or greater than card2.
		
		
		
	}
		

}

