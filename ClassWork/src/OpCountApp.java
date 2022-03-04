/*
 * 
 */
import java.util.Arrays;
public class OpCountApp {
	
	public static int[] selectionSort(int[] arr) {
		
		for(int i = 0; i < arr.length - 1; i++) {
			int smallest = arr[i];
			int smallestDex = i;
			for(int dex = i + 1; dex < arr.length; dex++) {
				if(arr[dex] < smallest) {
					smallest = arr[dex];
					smallestDex = dex;
				}
			}
			arr[smallestDex] = arr[i];
			arr[i] = smallest;
		}
		return arr;
	}
	
	public static void main(String[] args) {
		for(int size = 10; size < 1000000000; size += 2) {
			
			int[]myArr = new int[size];
			for(int i = 0; i < myArr.length; i++) {
				myArr[i] = (int) Math.random() * size;
			}
			
			long start = System.nanoTime();
			selectionSort(myArr);
			long elapsed = (int) (System.nanoTime() - start);
		
			System.out.printf("time/size = %d/%d = %f\n", elapsed, size, elapsed/(double)size);
		}
	}
}
