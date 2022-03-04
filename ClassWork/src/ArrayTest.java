import java.util.ArrayList;
import java.util.Scanner;

/*
 * ArrayTest.java -- Simple test of aray and ArrayList functionality
 * Jason Melnik
 * 1/11/2019
 * CSC
 */
import java.util.Random;
class Ball{
	int x, y;
	static Random rand = new Random();
	public Ball() {
		x = rand.nextInt(10);
		y = rand.nextInt(10);
	}
	
	public String toString() {
		return "(" + x + ", " + y + ")";
	}
}
public class ArrayTest {
	
	public static int sum(int ... intArr) {
		int val = 0;
		for(int ival : intArr) {
			val += val;
		}
		return val;
	}
	
	public static void printThings(int nTimes, Object ... objects) {
		while(nTimes-->0) {
			for(int i = 0; i < objects.length; i++) {
				System.out.println(objects[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		int total = sum(1, 3, 5, 7, 9, 2, 4, 6, 8, 10);
		
		Ball b1 = new Ball();
		
		printThings(3, new Ball(), new Ball(), b1);
		
		int []myArr = new int[10];
		
		for(int val : myArr) {
			System.out.println(val);
		}
		
		int numCubes = 6;
		for(int i = 0; i < numCubes; i++) {
			myArr[i] = i*i*i;
		}
		
		for(int i = 0; i < numCubes; i++) {
			System.out.println(myArr[i]);
		}
		
		ArrayList<Integer> myArrList = new ArrayList<Integer>();
		
		for(int val = 0 ; val < 6; val++) {
			myArrList.add(val*val*val);
		}
		
		for(int val : myArrList)
			System.out.println(val);
		
		Scanner scan = new Scanner(System.in);
		
		int []valCount = new int[101];
		
		int inval = scan.nextInt();
		while(inval >= 1 && inval <= 100) {
			valCount[inval]++;
			inval = scan.nextInt();
		}
		
		for(int i = 1; i <= 100; i++) {
			System.out.println(i + " appears " + valCount[i] + " times!");
		}
		
		ArrayList<ArrayList> myArrLis = new ArrayList<ArrayList>();
		myArrLis.add(myArrList);
		ArrayList<ArrayList> myArrLi = new ArrayList<ArrayList>();
		myArrLi.add(myArrLis);
		
		System.out.println(myArrLi);
		
		
	}
}
