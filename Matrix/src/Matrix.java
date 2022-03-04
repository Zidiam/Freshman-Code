/*
 * Matrix.java -- A general nxm matrix class for Java
 */
public class Matrix {
	
	private double[][] finalresult;
	protected double theta, x, y, cx, cy;
	private static double[][] transMatrix;
	private double[][] rotMatrix;
	private double[][] negtransMatrix;
	private double[] vectorArray;
	
	
	public Matrix(double theta, double x, double y, double cx, double cy) {
		this.theta = theta;
		this.x = x;
		this.y = y;
		this.cx = cx;
		this.cy = cy;
		finalresult = new double[3][3];
	}
	
	public void setup() {
		TransMatrix tMatrix = new TransMatrix(cx, cy);
		TransMatrix negtMatrix = new TransMatrix(-cx, -cy);
		RotMatrix rMatrix = new RotMatrix(theta);
		Vector vector = new Vector(x, y);
		
		
		vectorArray = vector.getVector();
		transMatrix = tMatrix.getTransMatrix();
		rotMatrix = rMatrix.getRotMatrix();
		negtransMatrix = negtMatrix.getTransMatrix();
	}
	
	public double[][] matrixMultiply(double[][] first, double[][] second){
		double[][] temp = new double[3][3];
		double tempint;
		
		//Multiplying Transition Matrix with Rotation Matrix
		for(int row = 0; row < temp.length; row++) {
			for(int col = 0; col < temp[row].length; col++) {
				tempint = 0;
				for(int x = 0; x < 3; x++) {
					tempint += first[row][x] * second[x][col];
				}
				temp[row][col] = tempint;
			}
		}
		return temp;
	}
	
	public void matrixmultiply() {
		double[][] temp = new double[3][3];
		double tempint;
		
		temp = this.matrixMultiply(transMatrix, rotMatrix);
		
		temp = this.matrixMultiply(temp, negtransMatrix);
		
		finalresult = temp;
	}
	
	public double[] vectorMultiply() {
		//check this after
		double[] result = new double[3];
		double tempint = 0;
		for(int x = 0; x < 3; x++) {
			tempint = 0;
			for(int col = 0; col < 3; col++) {
				tempint+= finalresult[x][col] * vectorArray[col];
			}
			result[x] = tempint;
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Matrix test = new Matrix(Math.PI/200, 10, 25, 250, 250);
		
		test.setup();
		test.matrixmultiply();
		
		double[] answer = test.vectorMultiply();
		
		
		System.out.println("Vector after Transformation: ");
		for(int i = 0; i < answer.length; i++) {
			System.out.println(answer[i] + ", ");
		}
	}
	
	
}
