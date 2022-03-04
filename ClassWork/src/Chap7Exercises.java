/*
 * 
 */
public class Chap7Exercises {
	public static void switchThem (int[] first, int[] second)
	{
	 if (first.length == second.length)
	 {
		 int [] temp = new int[first.length];
		 for (int i=0; i < first.length; i++)
			 temp[i] = first[i];
		 
		 for (int i=0; i < first.length; i++)
			 first[i] = second[i];
		 
		 for (int i=0; i < first.length; i++)
			 second[i] = temp[i];
	 }
	 else
	System.out.println("The arrays have different sizes");
	}
	
	public static void main(String[] args) {
		int[] one = {1, 2, 3};
		int[] two = {4, 5, 6};
		switchThem(one, two);
		
		int[] scores = new int[30];
		char grades[] = {'a', 'b'};
		
		int[] numbers = {3, 2, 3, 6, 9, 10, 12, 32, 3, 12, 6};
		for(int count = 1; count <= numbers.length - 1; count++) {
			System.out.println(numbers[count]);
		}
		
		String[] studentNames = new String[25];
		Double[] studentGrades = new Double[40];
		String[] transaction = {"transactionnumber", "name", "charge"};
		String[] studentandGrade = {"name", "grade"};
		String[] employee = {"number", "hiredate", "ammount of first raise", "2nd raise", "3rd raise", "4th raise", "5th raise"};
		
	}
}
