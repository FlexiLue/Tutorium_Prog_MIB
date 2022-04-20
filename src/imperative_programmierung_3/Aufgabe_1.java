package imperative_programmierung_3;
import static prog.ConsoleReader.*;

public class Aufgabe_1 {

	public static void main(String[] args) {
		String wort = readString("wort");		
		
		for(int i = 0; i < wort.length(); i++) {
			int countForChar = findCharOccurrence(wort, wort.charAt(i));
			System.out.println(wort.charAt(i) + ": " + countForChar);
		}
	}
	
	public static int findCharOccurrence(String wort, char character) {
		int count = 0;
		for(int i = 0; i < wort.length(); i++) {
			if(wort.charAt(i) == character) {
				count++;
			}
		}
		return count;
	}

}