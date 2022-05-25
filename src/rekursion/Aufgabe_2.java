package rekursion;
import static prog.ConsoleReader.*;

public class Aufgabe_2 {

	public static void main(String[] args) {
		
		int [] inputs = readIntArray();
		for(int i = 0; i < inputs.length; i++) {
			System.out.println(inputs[i] +": " + fakultaet(inputs[i]) + " " + fakultaetRecursive(inputs[i]));
		}
		
//		int x = readInt("x");
//		System.out.println(fakultaet(x));
//		System.out.println(fakultaetRecursive(x));
	}

	//only till n = 12 (Integer has a max of 2.147.483.647) 
	//12! =   479.001.600
	//13! = 6.227.020.800
	public static int fakultaet(int n) {
		
		int totalCount = 1;
		
		for(int i = 1; i <= n; i++) {
//			totalCount *= i;
			totalCount = totalCount * i;
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
