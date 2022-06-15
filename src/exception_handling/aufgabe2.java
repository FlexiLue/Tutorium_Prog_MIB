package exception_handling;

import java.util.*;

public class aufgabe2 {

	public static void main(String[] args) {
		String[] stringArray = {"23+14-12-3", "3+18", "23414","-3-4", "18-7-", "14++8", "13a+9", "18+y"};
		 
		for (String string : stringArray) {
			try {				
				System.out.println(auswerten(string));
			} catch (Throwable e) {
				System.out.println(e);
			}
		}
		

	}
	
	public static int auswerten(String eingabe) {
		StringTokenizer tokenizer = new StringTokenizer(eingabe, "+-", true);
		
		int value = 0;
		String operator = "+";
		boolean recentlyUpdated = false;
		String currentToken = "";
		
		while(tokenizer.hasMoreTokens()) {
			currentToken = tokenizer.nextToken();
			if(currentToken.equals("+") || currentToken.equals("-")) {
				if(recentlyUpdated == false) {					
					operator = currentToken;
					recentlyUpdated = true;
				} else {
					throw new Error("Die Zeichenkette darf nicht zwei Operatoren hintereinander enthalten");
				}
			} else {
				int tokenValue = Integer.parseInt(currentToken);
				switch(operator) {
					case "+": value += tokenValue;
					break;
					case "-": value -= tokenValue;
					break;
				}
				recentlyUpdated = false;
			}
		}
		if(currentToken.equals("+") || currentToken.equals("-")) {
			throw new Error("Die Zeichenkette darf nicht mit einem Operator enden");
		}
		
		
		return value;
	}

}
