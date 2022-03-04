/*
 * PairOfDice.java -- Simulates a pair of dice
 * Jason Melnik
 * CSC 120
 * 10/23/18
 */
public class PairOfDice {
	
	// Attribute variables or state-variables
	Die6 d1, d2;
	
	/**
	 * constructor()
	 */
	public PairOfDice() {
		d1 = new Die6();
		d2 = new Die6();
	}
	
	/*
	 * toss()
	 * Setter/mutator
	 * this tosses both dice
	 */
	public void toss() {
		d1.toss();
		d2.toss();
	}
	
	//This is a getter method that returns the sum of the two dice
	public int getTotal() {
		return getD1() + getD2();
	}
	//This is a getter method that returns the value of first dice
	public int getD1() {
		return d1.getFace();
	}
	//This is a getter method that returns the value of second dice
	public int getD2() {
		return d2.getFace();
	}
	//This is a getter method that returns a true or false if the pair of dice rolled Snake Eyes
	public boolean hasSnakeEyes() {
		return getD1() == 1 && getD2() == 1;
	}
	//This is a getter method that returns a true or false if the pair of dice rolled a one
	public boolean hasOne() {
		return getD1() == 1 || getD2() == 1;
	}
	//This is a getter method that returns a true or false if the pair of dice rolled BoxCars
	public boolean hasBoxCars() {
		return getD1() == 6 && getD2() == 6;
	}
	//This is a getter method that returns a true or false if the pair of dice rolled A 7 the hard way
	public boolean has7HardWay() {
		return ((getD1() == 6 && getD2() == 1) || (getD1() == 1 && getD2() == 6));
	}
	
	//this is what gets returned when using the object itself
	public String toString() {
		return "Total: " + getTotal() + " d1: " + d1.getFace() + " d2: " + d2.getFace() ;
	}
	
	//quick tests
	public static void main(String[] args) {
		PairOfDice mydice = new PairOfDice();
		System.out.println(mydice);
	}
}
