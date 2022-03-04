/*
 * funWithArrays.java -- some experiments with arrays of ints and Cards!
 * Jason Melnik
 * CSC 120
 * 10/30/18
 */
public class funWithArrays {

	public static void main(String[] args) {
		int []myList = new int[25];
		int []List2 = {2, 3, 5, 7, 11, 13, 17, 23};
		
		for(int dex = 0; dex < myList.length; dex++)
			System.out.println(myList[dex]);
				
		Deck myDeck = new Deck();
		myDeck.shuffle();
		
		System.out.println(myDeck.getCard(5) + " is the 6th card from the bottom of the deck");
		while(!myDeck.isEmpty())
			System.out.print(myDeck.deal() + " ");
		System.out.println();
		
	}

}
