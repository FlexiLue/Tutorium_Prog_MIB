package personen_im_krankenhaus;

public class GesetzlichVersicherter extends Kunde {
	String krankenkasse;

	public GesetzlichVersicherter(String vorname, String nachname, Geschlecht geschlecht, Anrede anrede,
			Arzt behandelnderArzt, String krankenkasse) {
		super(vorname, nachname, geschlecht, anrede, behandelnderArzt);
		this.krankenkasse = krankenkasse;
	}

}
