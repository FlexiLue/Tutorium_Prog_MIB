package personen_im_krankenhaus;


public class Krankenpfleger extends Mitarbeiter{

	public Krankenpfleger(String vorname, String nachname, Geschlecht geschlecht, Anrede anrede, int personalnummer, int gehalt) {
		super(vorname, nachname, geschlecht, anrede, personalnummer, gehalt);
	}
	
	public String formloseAnsprache() {
		Person person = this;
		return person.ansprache();
	}
	
	public String ansprache() {
		return (anrede == Anrede.FRAU ? "Kraneknplegerin " : "Krankenpfleger ") +  vorname + " " + nachname ;
	}
}
