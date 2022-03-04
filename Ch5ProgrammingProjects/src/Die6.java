/*
 * 
 */
import java.util.Random;
public class Die6 {
	//class variable (static)(not "state")
	static Random rand = new Random();
	
	
	//state variable
	private int faceVal;
	
	public Die6() {//new dice .self
		faceVal = rand.nextInt(6) + 1;
	}
	
	//Accessor or getter methods
	public int getFaceVal() {
		return faceVal;
	}
	
	public String toString() {
		return "" + faceVal;
	}
	
	//Mutator or Setter methoths
	public void toss() {//mutator
		faceVal = rand.nextInt(6) + 1;
	}
	
	public void setFaceVal(int val) {//setter
		if(val >=1 && val <= 6)
			faceVal = val;
	}
}
