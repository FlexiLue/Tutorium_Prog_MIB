package bildverarbeitung;

import static prog.Picture.*;

public class PictureExample {
	public static void main(String args[]) {
	// Laden des Bildes in ein zweidimensionales Array
	int p [][] = loadResource("bildverarbeitung/MyPicture.jpg");
	int[][] picture = new int[p.length][p[0].length];
	
	// Das Bild wird verändert
	
	//Aufgabe A
	/*for (int y = 69; y < 160; y++) {		
		for(int x = 29; x < 250; x++)
			p[x][y] = 0;
	}*/
	
	//Aufgabe B
	/*for(int x = 0; x < p.length-1; x++) {
		for(int y = 0; y < p[0].length-1; y++) {
			picture[x][y] = p[p.length-1-x][y];
		}
	}*/
	
	//Aufgabe C
	/*for(int x = 0; x < p.length-1; x++) {
		for(int y = 0; y < p[0].length-1; y++) {
			double result = Math.sqrt((x-150)*(x-150) + (y-150)*(y-150));
			if(result <= 100) {
				picture[x][y] = 0;
			} else {
				picture[x][y] = p[x][y];
			}
		}
	}*/
	
	//Aufgabe D
	/*for(int x = 0; x < p.length-1; x++) {
		for(int y = 0; y < p[0].length-1; y++) {
			double result = Math.sqrt((x-150)*(x-150) + (y-150)*(y-150));
			if(result <= 100) {
				int newY = 150 - (y-150);
				picture[x][y] = p[x][newY];
			} else {
				picture[x][y] = p[x][y];
			}
		}
	}*/
	
	//Aufgabe E
	/*for(int y = 0; y < p[0].length; y++) {
		for(int x = 0; x < p.length; x++) {
			int a = x + 180;
			if(a < p.length) {
				picture[a][y] = p[x][y];
			}if(a >= p.length) {
				picture[a-p.length][y] = p[x][y];
			}
		}
	}*/
    
    //Aufgabe F
    for(int y = 0; y < p[0].length; y++) {
    	for(int x = 0; x < p.length; x++){
    		//if(x+y > p.length-1) {
    		if(x + (p.length-1-y) > p.length-1) {
    			//picture[0 + (x+y - p.length)][y] = p[x][y];
    			picture[0 + (x + (p.length-1-y) - p.length)][y] = p[x][y];
    		} else {
    			//picture[x+y][y] = p[x][y];
    			picture[x + (p.length-1-y)][y] = p[x][y];
    		}
    	}
	}
	
	System.out.println("Höhe: " + p[0].length + " Breite: " + p.length);
	
	// Anzeigen des geänderten Bildes
	show(picture);
	}
}
