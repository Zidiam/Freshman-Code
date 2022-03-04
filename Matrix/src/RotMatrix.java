/*
 * RotMatrix.java --
 * Jason Melnik
 * 1/28/2019
 */
public class RotMatrix{
	private double[][] rotMatrix;
	private double theta;
	
	public RotMatrix(double theta) {
		this.theta = theta;
		rotMatrix = new double[3][3];
		setup();
	}
	
	public void setup() {
		rotMatrix[0][0] = Math.cos(theta);
		rotMatrix[0][1] = -Math.sin(theta);
		rotMatrix[1][0] = Math.sin(theta);
		rotMatrix[1][1] = Math.cos(theta);

		rotMatrix[2][2] = 1;
	}
	
	public double[][] getRotMatrix(){
		return rotMatrix;
	}


}
