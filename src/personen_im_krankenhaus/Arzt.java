package personen_im_krankenhaus;

public class Arzt extends Mitarbeiter {
	int buerozimmernummer;
	Rang rang;
	
	
	public Arzt(String vorname, String nachname, Geschlecht geschlecht, Anrede anrede, int personalnummer, int gehalt, int buerozimmernummer, Rang rang) {
		super(vorname, nachname, geschlecht, anrede, personalnummer, gehalt);
		this.buerozimmernummer = buerozimmernummer;
		this.rang = rang;
	}
	
	public String ansprache() {
		String rangAnrede = " "; 
		if(anrede == Anrede.FRAU) {
			switch(rang) {
			case ASSISTENZARZT:
				rangAnrede =  "Assistenz�rztin";
				break;
			case CHEFARZT:
				rangAnrede =  "Chef�rztin";
				break;
			case DIREKTOR:
				rangAnrede =  "Diretkroin";
				break;
			case FACHARZT:
				rangAnrede =  "Fach�rztin";
				break;
			case LEITENDER_OBERARZT:
				rangAnrede =  "Leitende Ober�rztin";
				break;
			case OBERARZT:
				rangAnrede =  "Ober�rztin";
				break;
			default:
				break;
			}
		} else {
			switch(rang) {
			case ASSISTENZARZT:
				rangAnrede =  "Assitenzarzt";
				break;
			case CHEFARZT:
				rangAnrede =  "Chefarzt";
				break;
			case DIREKTOR:
				rangAnrede =  "Direktor";
				break;
			case FACHARZT:
				rangAnrede =  "Facharzt";
				break;
			case LEITENDER_OBERARZT:
				rangAnrede =  "Leitende Oberarzt";
				break;
			case OBERARZT:
				rangAnrede =  "Oberarzt";
				break;
			default:
				break;
			}
		}
		
		return rangAnrede + " " + vorname + " " + nachname;
	}
	
	public boolean rangHoeherAls(Arzt arzt) {
		return this.rang.ordinal() > arzt.rang.ordinal() ? true : false;
	}
	
}
