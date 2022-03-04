
public class Factorial {

	public static double fibo(int n) {
		if (n == 1 || n == 2)
			return 1;
		return fibo(n - 1) + fibo (n - 2);
	}
	public static double factorial(int n) {

		int fact = 1;
		for (int i = 2; i < n; i++)
			fact *= i;
		return fact;
	}

	public static double factRecursive(int n) {
		
		if (n == 0)
			return 1;
		else
			return n * factRecursive(n - 1);
	}

	public static void main(String[] args) {
		int i = 10;
		System.out.println(fibo(i));
	}
}