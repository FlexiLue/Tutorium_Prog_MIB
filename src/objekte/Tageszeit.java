package objekte;

public class Tageszeit {
	int stunden;
	int minuten; 
	int sekunden; 
	boolean ampm = false;
	
	public static void main(String[] args) {
		Tageszeit tageszeit = new Tageszeit(12,10,10);
		
		//Test sekundenSeitMitternacht()
		System.out.println(tageszeit.sekundenSeitMitternacht());
		
		//Test vormittags()
		System.out.println(tageszeit.vormittags());
		
		//Test toString()
		System.out.println(tageszeit.toString());
		
		//Test vorstellen()
		tageszeit.vorstellen(0,10,10);
		System.out.println(tageszeit.toString());
		
		//Test istFrueherAls()
		Tageszeit tageszeitSpaeter = new Tageszeit (10,2,45);
		System.out.println(tageszeit.istFrueherAls(tageszeitSpaeter));
		
		//Test ampm behaviour
		tageszeit.ampm = true;
		System.out.println(tageszeit.toString());
	}
	
	public Tageszeit(int stunden, int minuten, int sekunden) {
		this.stunden = stunden;
		this.minuten = minuten; 
		this.sekunden = sekunden;
	}
	
	public Tageszeit(int stunden, int minuten) {
		this.stunden = stunden;
		this.minuten = minuten; 
		this.sekunden = 0;
	}
	
	public int sekundenSeitMitternacht() {
		return this.stunden*60*60 + this.minuten*60 + this.sekunden;
	}
	
	public boolean vormittags() {
//		if(this.stunden >= 12) {
//			return false;
//		}
//		return true;
		return this.stunden <= 12;
	}
	
	public String toString() {
		if(this.ampm) {			
			if(this.stunden > 11) {
				return (this.stunden-12) + ":" + this.minuten + "." + this.sekunden + " pm";
			} else {
				return this.stunden + ":" + this.minuten + "." + this.sekunden + " am";
			}
		}
		return this.stunden + ":" + this.minuten + "." + this.sekunden;
	}
	
	public void vorstellen(int stunden, int minuten, int sekunden) {
		if(this.sekunden + sekunden > 59) {
			this.sekunden = (this.sekunden + sekunden) - 60;
			this.minuten += 1;
		} else {
			this.sekunden += sekunden;
		}
		if(this.minuten + minuten > 59) {
			this.minuten = (this.minuten + minuten) - 60;
			this.stunden += 1;
		} else {
			this.minuten += minuten;
		}
		if(this.stunden + stunden > 23) {
			this.stunden = (this.stunden + stunden) - 24;
		} else {
			this.stunden += stunden;
		}
	}
	
	public boolean istFrueherAls(Tageszeit tageszeit) {
		if(this.sekundenSeitMitternacht() < tageszeit.sekundenSeitMitternacht()) {
			return false;
		}
		return true;
	}
	
}
