import static prog.ConsoleReader.*;

public class Multiplizierer {

	public static void main(String[] args) {
		int x = readInt("x");
		int y = readInt("y");
		int z = x * y;
		System.out.println(x + " mal " + y + " ergibt " + z);
	}
}
