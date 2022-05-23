package personen_im_krankenhaus;

public class Person {
	String nachname; 
	String vorname; 
	Geschlecht geschlecht;
	Anrede anrede;
	
	public Person(String vorname, String nachname, Geschlecht geschlecht, Anrede anrede) {
		this.vorname = vorname; 
		this.nachname = nachname; 
		this.geschlecht = geschlecht;
		this.anrede = anrede;
	}
	
	public String ansprache() {
		return (anrede == Anrede.FRAU ? "Frau " : "Herr ") +  vorname + " " + nachname ;
		
		//zweite Lösung
//		switch(anrede) {
//			case FRAU: return "Frau " + vorname + " " + nachname;
//			case HERR: return "Herr " + vorname + " "+ nachname;
//			default: return "";
//		}
		
		//return anrede.toString().substring(0, 1).toUpperCase() + anrede.toString().substring(1).toLowerCase() +  " " + vorname + " " + nachname;
	
	} 
}
