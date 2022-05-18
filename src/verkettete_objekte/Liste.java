package verkettete_objekte;

public class Liste {
	public int element;
	public Liste nachfolger;
	
	public Liste (int w) {
		element = w;
		nachfolger = null;
	}
	
	public void hinzufuegen (int w) {
		if (nachfolger == null)
			nachfolger = new Liste(w);
		else
			nachfolger.hinzufuegen(w);
	}
	
	public int laenge() {
		int count = 1;
		Liste currentObject = this;
		while(currentObject.nachfolger != null) {
			count++;
			currentObject = currentObject.nachfolger;
		}
		return count; 
	}
	
	public void entfernen() {
		Liste currentObject = this;
		if(this.laenge() != 1) {
			while(currentObject.nachfolger.nachfolger != null) {
				currentObject = currentObject.nachfolger;
			}
			currentObject.nachfolger = null; 
		}
	}
	
	public String toString() {
		String result = "";
		Liste currentObject = this;
		while(currentObject.nachfolger != null) {
			result = result + currentObject.element + ",";
			currentObject = currentObject.nachfolger;
		}
		result = result + currentObject.element;
		return result;
	}
	
	public int summe() {
		int result = 0;
		Liste currentObject = this;
		while(currentObject.nachfolger != null) {
			result += currentObject.element;
			currentObject = currentObject.nachfolger;
		}
		result += currentObject.element;
		return result; 
	}
	
	public void addiere(int number) {
		Liste currentObject = this;
		while(currentObject.nachfolger != null) {
			currentObject.element += number;
			currentObject = currentObject.nachfolger;
		}
		currentObject.element += number;
	}
}

