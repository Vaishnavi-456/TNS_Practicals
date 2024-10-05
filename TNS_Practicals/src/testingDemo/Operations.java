package testingDemo;

public class Operations {
	public static int sequentialSearch(int[] array, int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static boolean checkPrime(int num) {
		int i;
		if (num <= 1) {
			return false;
		}
		for (i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;

			}

		}
		return true;
	}
	
	public static void displayFactorial(int n)
	{
		int f=1;
		for (int i = 1;i<=n;i++)
			f=f*i;
		System.out.println("Factorial of "+n+" is "+f);
	}

}
