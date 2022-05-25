package verkettete_objekte;

public class KnotenTester {

	public static void main(String[] args) {
		Knoten knoten1 = new Knoten(3);
		knoten1.einfuegen(1);
		knoten1.einfuegen(2);
		knoten1.einfuegen(6);
		knoten1.einfuegen(5);
//		knoten1.einfuegen(11);
//		knoten1.einfuegen(9);
		
		System.out.println(knoten1.toString());
	}

}
