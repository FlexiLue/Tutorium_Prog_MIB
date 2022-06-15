package exception_handling;

public class aufgabe1 {
	
	public static void main(String[] args) throws Exception {
		int[] example1 = { 1, 3, 5, 8, 6, 9, 12 };
		int[] example2 = { 3, 8, 19, 14, 13, 200 };
		int[] example3 = { 7, 4, 2, 1 };
		
		int[] example4 = { 1, 2, 3 };
		int[] example5 = {};
		
		System.out.println(f(example1));
		System.out.println(f(example2));
		System.out.println(f(example3));
		
		//System.out.println(f(example4));
		//System.out.println(f(example5));
	}
	
	public static int f(int[] x) throws Exception {
		for(int i = 0; i < x.length-1; i++) {
			if(x[i] > x[i+1]) {
				return x[i];
			}
		}
		throw new Exception();
	}

}
