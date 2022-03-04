/*
 * Die6.java -- Simulates a single six sided die
 * Jason Melnik
 * CSC 120
 * 10/23/18
 */
import java.util.Random;

public class Die6 {
	//class variables -- static variables
	private static final int NUMSIDES = 6;
	private static Random rand = new Random();
	
	//instance variables, object attributes, state- attributes
	private int faceVal;
	
	
	public Die6() {
		toss();
	}
	
	/**
	 * toss()
	 * Setter/Mutator
	 */
	public void toss() {
		faceVal = rand.nextInt(NUMSIDES) + 1;
	}
	
	/**
	 * getFace() -- accessor/Getter method to return face value
	 * @return faceVal
	 */
	public int getFace() {
		return faceVal;
	}
	
	/*
	 * setFace() -- setter/mutator to change face value
	 */
	public void setFace(int a) {
		if(1<= a && a <= NUMSIDES)
			faceVal = a;
		else
			throw new RuntimeException(a + " is no a legal face value.");
	}
	
	public String toString() {
		return "" + faceVal;
	}
	
}
