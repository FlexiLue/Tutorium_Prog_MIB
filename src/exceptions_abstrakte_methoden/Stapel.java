package exceptions_abstrakte_methoden;

import java.util.Vector;

public class Stapel {
	private Vector<String> vector;
	
	public Stapel() {
		this.vector = new Vector<String>();
	}
	
	
	
	
	public static void main(String[] args) throws Exception {
		Stapel beispielStapel = new Stapel();

		beispielStapel.push("eins");
		beispielStapel.push("zwei");
		beispielStapel.push("drei");
		beispielStapel.push("vier");
		beispielStapel.pull();
		
		Stapel beispiel2Stapel = new Stapel();
		beispiel2Stapel.push("eins");
		beispiel2Stapel.push("zwei");
		beispiel2Stapel.push("drei");
		beispiel2Stapel.push("vier");
		
		Stapel beispiel3Stapel = beispiel2Stapel.clone();
		
		System.out.println(beispielStapel.equals(beispiel2Stapel));
		System.out.println(beispielStapel.toString());
		System.out.println(beispiel3Stapel.toString());
	}
	
	public String toString() {
		String result = "";
		for(int i = 0; i < this.vector.size(); i++) {
			result += vector.elementAt(i);
			if(i<this.vector.size()-1)
				result += ",";
		}
		return result;
	}
	
	public Stapel clone() {
		Stapel newStapel = new Stapel();
		for(int i = 0; i < this.vector.size(); i++) {
			newStapel.push(this.vector.elementAt(i));
		}
		return newStapel;
	}
	
	public boolean equals(Stapel stapel) {
		if(this.vector.size() == stapel.vector.size()) {
			for(int i = 0; i < this.vector.size(); i++) {
				if(!(this.vector.elementAt(i).equals(stapel.vector.elementAt(i)))){
					return false;
				}
			}
		} else {
			return false;
		}
		return true;
	}
	
	public void push(String string) {
		vector.addElement(string);
	}
	
	public void pull() throws Exception {
		if(vector.size() > 0) {			
			vector.removeElementAt(vector.size()-1);
		} else {
			throw new Exception();
		}
	}

}
