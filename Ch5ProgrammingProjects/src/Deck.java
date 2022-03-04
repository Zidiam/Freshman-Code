/*
 * Deck.java -- Class to encapsulate behavio fof a deck of cards!
 * Jason Melnik
 * CSC 120
 * 10/30/2018
 */
import java.util.Random;
public class Deck {
	private static final Random rand = new Random();
	//instance variables defining state of object
	private Card []deck;
	private int top;
	
	//constructor
	public Deck() {
		deck = new Card[Card.RANK.length*Card.SUIT.length];
		int loc = 0;
		for(int rank = 0; rank < Card.RANK.length; rank++) {
			for (int suit = 0; suit < Card.SUIT.length; suit++) {
				deck[loc] = new Card(rank, suit);
				loc ++;
			}
		}
		top = deck.length - 1;
	}
	
	public Card getCard(int i) {
		if(i < 0 || i > top)
			throw new RuntimeException("card inde out of bounds: " + i);
		return deck[top - i];
	}
	
	public Card deal() {
		if(isEmpty())
			throw new RuntimeException("Attemting to deal from empty deck!");
		return deck[top--];
	}
	
	public boolean isEmpty() {
		return top < 0;
	}
	
	public int numCards() {
		return top + 1;
	}
	
	public void shuffle() {
		for(int i = 0; i <= top; i++) {
			int randDex = rand.nextInt(top + 1 - i) + i;
			Card temp = deck[i];
			deck[i] = deck[randDex];
			deck[randDex] = temp;
		}
	}
}
