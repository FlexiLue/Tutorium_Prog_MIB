package verkettete_objekte;

public class KnotenTester {

	public static void main(String[] args) {
//		Knoten knoten1 = new Knoten(3);
//		knoten1.einfuegen(1);
//		knoten1.einfuegen(2);
//		knoten1.einfuegen(6);
//		knoten1.einfuegen(5);
//		knoten1.einfuegen(11);
//		knoten1.einfuegen(9);
//		
//		System.out.println(knoten1.toString());
		
		Knoten knoten2 = new Knoten(2);
		knoten2.einfuegen(1);
		knoten2.einfuegen(5);
		knoten2.einfuegen(8);
		knoten2.einfuegen(12);
		knoten2.einfuegen(11);
		
		System.out.println(knoten2.toString());
		System.out.println(knoten2.suchen(5));
	}

}
