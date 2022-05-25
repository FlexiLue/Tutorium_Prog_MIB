package verkettete_objekte;

public class Knoten {
	int wert;
	Knoten links; 
	Knoten rechts;
	
	public Knoten(int wert) {
		this.wert = wert;
		this.links = null; 
		this.rechts = null;
	}
	
	public void einfuegen(int n) {
		Knoten knoten = new Knoten(n);
		
		if(n > wert) {
			if(rechts != null) {
				rechts.einfuegen(n);
			} else {
				rechts = knoten;
				return;
			}
		} else if (n < wert) {
			if(links != null) {
				links.einfuegen(n);
			} else {
				links = knoten;
				return;
			}
		}
	}
	
	public String toString() {
		if(links == null && rechts == null ) {
			return "(" + wert +")";
		}
		if(links != null && rechts != null) {
			return "(" + links.toString() + wert + rechts.toString() + ")";
		}
		if(rechts != null) {
			return "" + wert + rechts.toString() + ")";
		}
		if(links != null) {
			return "(" + links.toString() + wert + ")";
		}
		return ""; 
	}
}
