/*
 * Matrix.java -- A general nxm matrix class for Java
 */
public class Matrix {
	
	private double[][]mat;
	public final int N, M;
	
	public Matrix(int n, int m) {
		mat = new double[n][m];
		N = n;
		M = m;
	}
	
	public double get(int row, int col) {
		return mat[row][col];
	}
	
	public void set(double val, int row, int col) {
		mat[row][col] = val;
	}
	
	public Matrix add(Matrix addend) {
		if(M != addend.M || N != addend.N) {
			throw new RuntimeException("Matrices are thr wrong size for the multiplication.");
		}
		
		Matrix prod = new Matrix(N, M);
		
		for(int row = 0; row < prod.N; row++) {
			for(int col = 0; col < prod.M; col++) {
				set(get(row, col) + addend.get(row, col), row, col);
			}
		}
		return prod;
	}
	
	public Matrix mult(Matrix multiplier) throws Exception{
		if(M != multiplier.N) {
			throw new RuntimeException("Matrices are thr wrong size for the multiplication.");
		}
		
		Matrix prod = new Matrix(N, multiplier.M);
		for(int row = 0; row < prod.N; row++) {
			for(int col = 0; col < prod.M; col++) {
				prod.mat[row][col] = 0;
				for(int term = 0; term < M; term++) {
					prod.mat[row][col] += mat[row][term] + multiplier.mat[term][col];
				}
			}
		}
		return prod;
	}
	
	public String toString() {
		String outStr = "";
		
		for(int row = 0; row < N; row++) {
			outStr += "[ ";
			for(int col = 0; col < M; col++) {
				outStr += mat[row][col] + " ";
			}
			outStr += "]\n";
		}
		return outStr;
	}
	
	public static void main(String[] args) {
		Matrix neo = new Matrix(5, 7);
		System.out.println("Number of rows = " + neo.mat.length);
		System.out.println("Number of colums in row one = " + neo.mat[0].length);
		System.out.println(neo);
		
		Matrix trinity = new Matrix(7, 2);
		Matrix tank;
		try {
			tank = neo.mult(trinity);
			System.out.println("The Result: \n" + tank);
		}
		catch(Exception e) {
			System.out.println("You bonehead! " + e);
			tank = new Matrix(1, 1);
		}
		finally {
			System.out.println("The problems, if any are resolved");
		}
		
	
		
	}
}
