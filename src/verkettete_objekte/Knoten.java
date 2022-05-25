package verkettete_objekte;

public class Knoten{
	int x; 
	Knoten links; 
	Knoten rechts; 
	
	public Knoten(int x) {
		this.x = x;
		this.links = null;
		this.rechts = null;
	}

	public void einfuegen(int wert) {
		if(wert < x) {
			if(links == null) {
				links = new Knoten(wert);
			} else {
				links.einfuegen(wert);
			}
			
		} else if (wert > x) {
			if(rechts == null) {
				rechts = new Knoten(wert);
			} else {
				rechts.einfuegen(wert);
			}
			
		}
	}
	
	@Override
	public String toString() {
		
		if(links == null && rechts == null) {
			return "(" + x + ")";
		} else if (links == null) {
			return "(" + x + rechts.toString() + ")";
		} else if (rechts == null) {
			return "(" + links.toString() + x + ")";
		} else {
			return "(" + links.toString() + x + rechts.toString() + ")";
		}
		
	}
	
	public boolean suchen(int wert) {
		if(wert == this.x) {
			return true;
		} else if(wert < x && links != null ) {
			return links.suchen(wert);
		} else if(wert > x && rechts != null) {
			return rechts.suchen(wert);
		}
		return false;
	}
}