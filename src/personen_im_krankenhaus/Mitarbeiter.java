package personen_im_krankenhaus;

public class Mitarbeiter extends Person{
	int personalnummer; 
	int gehalt;
	
	public Mitarbeiter(String vorname, String nachname, Geschlecht geschlecht, Anrede anrede, int personalnummer, int gehalt) {
		super(vorname, nachname, geschlecht, anrede);
		this.personalnummer = personalnummer;
		this.gehalt = gehalt;
		
	}
}
