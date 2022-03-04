
public class TowersOfHanol {
	
	static void sortList(int []arr, int n) {
		if(n != 0)
			//find largest thing in arr[0..n] and move to position n
			sortList(arr, n-1);
	}
	
	
	
	/*
	 * Print out series of moves to move n disks from from to to using use
	 * @param n
	 */
	static void solveTowers(int n, String From, String to, String use) {
		if(n == 1)
			System.out.println("Move disk from " + From + " to " + to);
		else {
			solveTowers(n - 1, From, use, to);
			System.out.println("Move disk from " + From + " to " + to);
			solveTowers(n-1, use, to, From);
		}
	}
	
	public static void main(String[] args) {
		
		String peg0 = "peg0";
		String peg1 = "peg1";
		String peg2 = "peg2";
		
		int numDisks = 4;
		
		//move numDisks disks from peg0 to peg2 by using peg1 as helper
		solveTowers(numDisks, peg0, peg2, peg1);
	}
}
