/*
 * Vector.java
 * Jason Melnik
 * 1/28/19
 */
public class Vector{
	private double[] vectorArray;
	private double x, y;
	
	public Vector(double x, double y) {
		this.x = x;
		this.y = y;
		vectorArray = new double[3];
		setup();
	}
	
	public void setup() {
		vectorArray[0] = x;
		vectorArray[1] = y;
		vectorArray[2] = 1;
	}
	
	public double[] getVector() {
		return vectorArray;
	}


}
