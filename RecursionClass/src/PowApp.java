
public class PowApp {
	
	static int iterCount;
	
	public static double iterPow(int a, int b) {
		iterCount = 0;
		double prod = 1;
		for(int i = 0; i < b; i++) {
			prod = prod * a;
			iterCount ++;;
		}
		return prod;
	}
	
	static int recurrCount = 0;
	public static double recurrPow(int a, int b) {
		if(b == 0)
			return 1;
		else {
			if( b % 2 == 0) {
				recurrCount ++;
				double val = recurrPow(a, b/2);
				return val * val;
			}
			else {
				recurrCount += 1;
				return a * recurrPow(a, b - 1);
			}
		}
	}
	
	public static void main(String [] args) {
		int a = 5;
		int b = 200;
		
		System.out.println(a + "^" + b + "= " + iterPow(a, b) + " with the op count of iterPow: " + iterCount);
		
		System.out.println(a + "^" + b + "= " + recurrPow(a, b) + " with the op count of recurrPow: " + recurrCount);
	}
}
