/*
 * Card.java -- Simulates 5 random cards in a deck
 * Jason Melnik
 * CSC 120
 * 10/28/2018
 */
import java.util.*;
public class Card {
	//class variables / static
	private static String[] allCards = {"Ace of Hearts", "Ace of Diamonds","Ace of Clubs","Ace of Spades", 
										"2 of Hearts", "2 of Diamonds", "2 of Clubs", "2 of Spades", 
     									"3 of Hearts", "3 of Diamonds", "3 of Clubs", "3 of Spades",
										"4 of Hearts", "4 of Diamonds", "4 of Clubs", "4 of Spades", 
										"5 of Hearts", "5 of Diamonds", "5 of Clubs", "5 of Spades", 
										"6 of Hearts", "6 of Diamonds", "6 of Clubs", "6 of Spades", 
										"7 of Hearts", "7 of Diamonds", "7 of Clubs", "7 of Spades", 
										"8 of Hearts", "8 of Diamonds", "8 of Clubs", "8 of Spades", 
										"9 of Hearts", "9 of Diamonds", "9 of Clubs", "9 of Spades", 
										"10 of Hearts", "10 of Diamonds", "10 of Clubs", "10 of Spades", 
										"Jack of Hearts", "Jack of Diamonds", "Jack of Clubs", "Jack of Spades", 
										"Queen of Hearts", "Queen of Diamonds", "Queen of Clubs", "Queen of Spades", 
										"King of Hearts", "King of Diamonds", "King of Clubs", "King of Spades"};
	private static Random rand = new Random();
	private static int ammountOfCards = 5;
	
	 private List<String> drawnCards = new ArrayList<String>();
	
	 
	public Card() {
		randCards();
	}
	
	//this chooses 5 ranndom cards for the class
	public void randCards() {
		for(int i = 0; i < ammountOfCards; i++)
			drawnCards.add(allCards[rand.nextInt(52)]);
	}
	
	//this is what is returned when the object is called
	public String getCards() {
		return "" + drawnCards;
	}
	
	//This is what gets returned when the object is called
	public String toString() {
		return getCards();
	}
	
}
