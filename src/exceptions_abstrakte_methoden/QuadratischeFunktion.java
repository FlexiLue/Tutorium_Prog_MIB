package exceptions_abstrakte_methoden;

public class QuadratischeFunktion extends Funktion{
	double a; 
	double b; 
	double c; 
	
	public QuadratischeFunktion(double a, double b, double c) {
		this.a = a; 
		this.b = b; 
		this.c = c;
	}
	
	public static void main(String args[]) {
		QuadratischeFunktion funktion1 = new QuadratischeFunktion(1,3,4);
		
		System.out.println("Nullstelle bei:" + funktion1.nullstellensuche(-1.5, 1.5, 0.01 ));
	}
	
	
	public double f(double x) {
		return a*Math.pow(x, 2) + b*x + c;
	}
	
	public double nullstellensuche(double r, double s, double t) {
		/*double[] interval = {-100,100};
		while(true) {
			if(mittelwert < 0.0001) {
				return -1;
			}
			double mittelwert = (-100 + 100) / 2;
			
		}*/
		double mittelwert = (r + s) / 2;
		double wert = f(mittelwert);
		System.out.println("Wert: " + wert + " Mittelwert: " + mittelwert);
		if(wert <= t)
			return mittelwert;
		else 
			return f(mittelwert) < 0 ? nullstellensuche(mittelwert, s, t) : nullstellensuche(r, mittelwert, t);
				
	}

}
