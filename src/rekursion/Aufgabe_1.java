package rekursion;

public class Aufgabe_1 {

	private static long[] fibonacciCache;
	
	public static void main(String[] args) {
		int number = 47;
		
		fibonacciCache = new long[number + 1];
		
		System.out.println("Without recursion: " + fibonacciWithoutRecursion(number));
		System.out.println("With recursion and Cache: " + fibonacciWithoutRecursion(number));
		System.out.println("With recursion: " + fibonacci(number));
	}
	
	public static long fibonacci (int n) {
		if (n == 0)
			return 1;
		if (n == 1)
			return 1;
		return fibonacci(n-1) + fibonacci(n-2);
	}
	
	public static long fibonacciWithCache(int n) {
		if(n <= 1) {
			return n;
		}
		
		if(fibonacciCache[n] != 0) {
			return fibonacciCache[n];
		}
		
		long nthFibunacciNumber = fibonacciWithCache(n-1) + fibonacciWithCache(n-2);
		fibonacciCache[n] = nthFibunacciNumber;
		
		return nthFibunacciNumber;
	}
	
	public static long fibonacciWithoutRecursion(int n) {
		if(n < 0) {
			return 0;
		}
		
		long totalCount = 1; 
		long last = 1;
		long secondLast = 1;
		
		for(int i = 0; i <= n; i++) {
			if(i == 0 || i == 1) {
				continue;
			} else {
				totalCount = last + secondLast;
				secondLast = last;
				last = totalCount;
			}
		}
		
		return totalCount;
	}

}
