package sketch.orca;

public class ShacharTheorem {
	public static void main(String[] args) {
		int x = 6;
		int y = 8;

		System.out.println("x = "+x);
		System.out.println("y = "+y);
		
		x = (y - x) + (y = x);

		System.out.println("\nAPPLY SHACHAR'S THEOREM: x = (y - x) + (y = x);\n");

		System.out.println("x = "+x);
		System.out.println("y = "+y);
	}
}