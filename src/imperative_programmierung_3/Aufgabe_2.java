package imperative_programmierung_3;

import static prog.ConsoleReader.readString;

public class Aufgabe_2 {

	public static void main(String[] args) {
		String wort = readString("wort");	
		String substring = readString("substring");
		
		//int position = wort.indexOf(substring);
		int position = teilStringPosition(wort, substring);
		System.out.println(position);
	}
	
	public static int teilStringPosition(String wort, String substring) {
		int index = 0;
		int counter = 0;
		
		for(int i = 0; i < wort.length(); i++) {
			if(wort.charAt(i) == substring.charAt(0)) {
				index = i;
				while(counter < substring.length()) {
					if(!(wort.charAt(index + counter) == substring.charAt(counter))) {
						break; 
					} else if (counter == substring.length()-1) {
						System.out.println(counter);
						return index;
					}
					counter++;
				}
			}
		}
		return -1;
		
	}

}
