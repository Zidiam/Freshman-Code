/*
 * Card.java -- A good playing-card class for creating computer games
 * Jason Melnik
 * CSC 120
 * 10/30/2018
 */
import java.util.Random;
public class Card {
	
	//Class variables
	public static final Random rand = new Random();
	public static final String []RANK = {"A", "2", "3", "4", "5",
										"6", "7", "8", "9", "10"};
	public static final String []SUIT = {"C", "S", "H", "D"};
	
	//instance variables: state of an individual card
	private String rank;
	private String suit;
	
	//constructor
	public Card(String rank, String suit) {
		
		this.rank = rank;
		this.suit = suit;
	}
	public Card(int rankdex, int suitdex) {
		if(rankdex < 0 || rankdex >= RANK.length || suitdex < 0 || suitdex >= SUIT.length)
			throw new RuntimeException("rank or suit not in range");
		this.rank = RANK[rankdex];
		this.suit = SUIT[suitdex];
	}
	public Card() {
		rank = RANK[rand.nextInt(RANK.length)];
		suit = SUIT[rand.nextInt(SUIT.length)];
		}
	
	public String toString() {
		return rank + suit;
	}
	
	
}
