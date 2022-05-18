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
		
		
		
//		while(root != null) {
//			pointer = root;
//			if(n < root.x) {
//				root = root.links;
//			} else {
//				root = root.rechts;
//			}
//		}
//		
//		if(pointer == null) {
//			pointer = newKnoten;
//		} else if (n < pointer.x) {
//			pointer.links = newKnoten;
//		} else {
//			pointer.rechts = newKnoten;
//		}
	}
}
