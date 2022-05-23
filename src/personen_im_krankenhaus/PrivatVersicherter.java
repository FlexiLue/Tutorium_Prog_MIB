package personen_im_krankenhaus;

public class PrivatVersicherter extends Kunde {
	String iban;
	String bic;
	
	public PrivatVersicherter(String vorname, String nachname, Geschlecht geschlecht, Anrede anrede,
			Arzt behandelnderArzt, String iban, String bic) {
		super(vorname, nachname, geschlecht, anrede, behandelnderArzt);
		this.iban = iban; 
		this.bic = bic;
	}

}
