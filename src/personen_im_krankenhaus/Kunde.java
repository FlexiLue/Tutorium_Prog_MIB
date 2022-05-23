package personen_im_krankenhaus;

public class Kunde extends Person {
	Arzt behandelnderArzt;
	
	public Kunde(String vorname, String nachname, Geschlecht geschlecht, Anrede anrede, Arzt behandelnderArzt) {
		super(vorname, nachname, geschlecht, anrede);
		this.behandelnderArzt = behandelnderArzt;
	}
	
	public boolean arztRangHoeherAlsBei(Kunde kunde) {
		return this.behandelnderArzt.rangHoeherAls(kunde.behandelnderArzt) ? true : false;
	}

}
