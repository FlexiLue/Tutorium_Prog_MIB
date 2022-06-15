package imperative_programmierung_3;

import static prog.ConsoleReader.readString;

public class Aufgabe_2_live {

	public static void main(String[] args) {
		String wort = readString("wort");
		String substring = readString("substring");
		
		int result = teilStringPosition(wort, substring);
		int result2 = wort.indexOf(substring);
		System.out.println(result + " " + result2);

	}
	
	public static int teilStringPosition(String wort, String substring) {
		int counter = 0;
		
		for(int i = 0; i < wort.length(); i++) {
			if(wort.charAt(i) == substring.charAt(0)) {
				while(counter < substring.length()) {
					if(wort.charAt(i + counter) == substring.charAt(counter)) {
						if(counter == substring.length()-1) {
							return i;
						} 
						counter++;
					} else {
						break;
					}
				}
				
			}
		}
		return -1;
	}

}
