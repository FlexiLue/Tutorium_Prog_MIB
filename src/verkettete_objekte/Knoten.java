package verkettete_objekte;

public class Knoten {
	int x;
	Knoten links; 
	Knoten rechts;
	
	public Knoten(int x) {
		this.x = x;
		this.links = null; 
		this.rechts = null;
	}
	
	public void einfuegen(int n) {
		Knoten newKnoten = new Knoten(n);
		Knoten focusKnoten = this;
		Knoten parentKnoten;
		
		while(true) {
			parentKnoten = focusKnoten;
			if(n < focusKnoten.x) {
				focusKnoten = focusKnoten.links;
				if(focusKnoten == null) {
					parentKnoten.links = newKnoten;
					return;
				}
			} else {
				focusKnoten = focusKnoten.rechts;
				if(focusKnoten == null) {
					parentKnoten.rechts = newKnoten;
					return;
				}
			}
		}
		
	}
}
