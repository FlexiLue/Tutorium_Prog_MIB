package verkettete_objekte;

public class ListeTester {
	public static void main(String[] args) {
		Liste x = new Liste(3);
		x.hinzufuegen(5);
		x.hinzufuegen(4);
		x.hinzufuegen(7);
		
		System.out.println(x.laenge());
		
		x.entfernen();
		System.out.println(x.laenge());
		x.hinzufuegen(7);
		
		System.out.println(x.toString());
		
		System.out.println(x.summe());
		
		x.addiere(5);
		System.out.println(x.toString());
	}
}