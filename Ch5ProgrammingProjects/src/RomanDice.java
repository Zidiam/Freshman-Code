/*
 * RomanDice.java -- create a dice6 triplet class for playing ancient Roman dice-games
 * Jason Melnik
 * CSC 120
 * 10/22/18
 */
public class RomanDice {
	//state variables
	private Die6 d1, d2, d3;
	
	//constructors
	public RomanDice() {
		d1 = new Die6();
		d2 = new Die6();
		d3 = new Die6();
	}
	
	//getters
	public int getTotal() {
		return d1.getFaceVal() + d2.getFaceVal() + d3.getFaceVal();
	}
	
	public int getD1Val() {
		return d1.getFaceVal();
	}
	
	public int getD2Val() {
		return d2.getFaceVal();
	}
	
	public int getD3Val() {
		return d3.getFaceVal();
	}
	
	public String toString() {
		return "RomanDice [d1=" + d1 + ", d2=" + d2 + ", d3=" + d3 + "]";
	}
	
	
}
