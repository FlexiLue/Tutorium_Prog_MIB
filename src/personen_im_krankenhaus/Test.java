package personen_im_krankenhaus;

import static personen_im_krankenhaus.Geschlecht.*;
import static personen_im_krankenhaus.Anrede.*;
import static personen_im_krankenhaus.Rang.*;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Arzt arzt = new Arzt("Felix", "Lütte", MAENNLICH, HERR, 1, 500, 5, OBERARZT);
		Arzt arzt2 = new Arzt("Leon", "Lütte", MAENNLICH, HERR, 2, 800, 6, DIREKTOR);
		Kunde person = new Kunde("Felix", "Lütte", MAENNLICH, HERR, arzt);
		Kunde person2 = new Kunde("Ana", "Hirt", WEIBLICH, FRAU, arzt2);
		Krankenpfleger krankenpfleger = new Krankenpfleger("Max", "Musterman", MAENNLICH, HERR, 2, 250);
		
		
		
		System.out.println(person.ansprache());
		System.out.println(arzt.ansprache());
		System.out.println(arzt2.rangHoeherAls(arzt));
		System.out.println(person.arztRangHoeherAlsBei(person2));
		System.out.println(person2.ansprache());
		System.out.println(krankenpfleger.formloseAnsprache());
		
	}

}
