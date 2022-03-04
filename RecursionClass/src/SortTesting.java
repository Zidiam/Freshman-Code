
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class SortTesting {
	
	public static ArrayList<Integer> sortSelection(ArrayList<Integer> arr){
		for(int i = 0; i < arr.size() - 1; i++) {
			int min = arr.get(i);
			int mindex = i;
			for(int j = i + 1; j < arr.size(); j++) {
				if(min > arr.get(j).intValue()) {
					min = arr.get(j).intValue();
					mindex = j;
				}
			}
			int temp = arr.get(mindex);
			arr.set(mindex, arr.get(i));
			arr.set(i, temp);
		}
		
		return arr;
		
	}
	
	public static ArrayList<Integer> sortQuick(ArrayList<Integer> arr){
		if(arr.size() <= 1)
			return arr;
		else {
			ArrayList<Integer> lesser = new ArrayList<Integer>();
			ArrayList<Integer> greater = new ArrayList<Integer>();
			int pivot = arr.get(0);
			for(int i = 1; i < arr.size(); i++) {
				int k = arr.get(i);
				if(k <= pivot)
					lesser.add(k);
				else
					greater.add(k);
			}
			lesser = sortQuick(lesser);
			greater = sortQuick(greater);
			lesser.add(pivot);
			lesser.addAll(greater);
			
			return lesser;
		}
	}
	
	public static ArrayList<Integer> sortMerge(ArrayList<Integer> arr){
		if(arr.size() <= 1)
			return arr;
		else {
			int size = arr.size();
			ArrayList<Integer> firstHalf = new ArrayList<Integer>();
			ArrayList<Integer> secondHalf = new ArrayList<Integer>();
			for(int i = 0; i < size/2; i++) {
				firstHalf.add(arr.get(i));
				secondHalf.add(arr.get(i + size/2));
			}
			
			sortMerge(firstHalf);
			sortMerge(secondHalf);
			
			arr.clear();
			int fdex = 0;
			int sdex = 0;
			for(int i = 0; i < size; i++) {
				if(fdex < firstHalf.size()) {
					if(sdex < secondHalf.size()) {
						int fval = firstHalf.get(fdex);
						int sval = secondHalf.get(sdex);
						if(fval < sval) {
							arr.add(fval);
							fdex ++;
						}
						else {
							arr.add(sval);
							sdex ++;
						}
					}
					else {
						arr.add(firstHalf.get(fdex));
						fdex ++;
					}
				}
				else if(sdex < secondHalf.size()){
					arr.add(secondHalf.get(sdex));
					sdex ++;
				}
			}
			
			return arr;
		}		
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		ArrayList<Integer> numList = new ArrayList<Integer>();
		
		int listSize = 10;
		for(int i = 0; i < listSize; i++) {
			numList.add(rand.nextInt(10000));
		}
		
		if(listSize < 10000) {
			for(Integer i : numList) {
				System.out.print(" " + i);
			}
		}
		
		System.out.println("");
		System.out.println("Starting sort selection");
		numList = sortSelection(numList);
		System.out.println("Ending sort selection");
		if(listSize < 10000) {
			for(Integer i : numList) {
				System.out.print(" " + i);
			}
		}
		
		
		System.out.println("");
		
		
		numList = new ArrayList<Integer>();
		
		for(int i = 0; i < listSize; i++) {
			numList.add(rand.nextInt(10000));
		}
		
		System.out.println("");
		
		if(listSize < 10000) {
			for(Integer i : numList) {
				System.out.print(" " + i);
			}
		}
		
		System.out.println("");
		System.out.println("Starting sort quick");
		numList = sortQuick(numList);
		System.out.println("Ending sort quick");
		
		
		if(listSize < 10000) {
			for(Integer i : numList) {
				System.out.print(" " + i);
			}
		}
		
		System.out.println("");
		if(Collections.binarySearch(numList, new Integer(25)) > 0)
			System.out.println("25 is in the list");
		else
			System.out.println("25 is not in the list");
		
		
		
		numList = new ArrayList<Integer>();
		
		for(int i = 0; i < listSize; i++) {
			numList.add(rand.nextInt(10000));
		}
		
		System.out.println("");
		
		if(listSize < 10000) {
			for(Integer i : numList) {
				System.out.print(" " + i);
			}
		}
		
		System.out.println("");
		System.out.println("Starting sortmerge");
		numList = sortMerge(numList);
		System.out.println("Ending sortmerge");
		
		
		if(listSize < 10000) {
			for(Integer i : numList) {
				System.out.print(" " + i);
			}
		}
		
	}
}
