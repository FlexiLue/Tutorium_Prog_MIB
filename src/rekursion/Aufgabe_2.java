package rekursion;

public class Aufgabe_2 {

	public static void main(String[] args) {
		System.out.println(fakultaet(12));
		System.out.println(fakultaetRecursive(12));
	}

	//only till n = 12 (Integer has a max of 2.147.483.647) 
	//12! =   479.001.600
	//13! = 6.227.020.800
	private static int fakultaet(int n) {
		if(n == 1) {
			return 1;
		}
		
		int totalCount = 1;
		
		for(int i = 1; i <= n; i++) {
			totalCount *= i;
		}
		
		return totalCount;
	}
	
	private static int fakultaetRecursive(int i) {
		if(i == 1) {
			return 1;
		}
		return fakultaetRecursive(i-1)*i;
	}


}
