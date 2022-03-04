/*
 * TransMatrix.java -- 
 * Jason Melnik
 * 1/28/2019
 */
public class TransMatrix{
	private double[][] transMatrix;
	private double cx, cy;
	
	public TransMatrix(double cx, double cy) {
		this.cx = cx;
		this.cy = cy;
		transMatrix = new double[3][3];
		setup();
	}
	
	public void setup() {
		transMatrix[0][0] = 1;
		transMatrix[1][1] = 1;
		transMatrix[2][2] = 1;
		
		transMatrix[0][2] = cx;
		transMatrix[1][2] = cy;
	}

	public double[][] getTransMatrix(){
		return transMatrix;
	}
}
