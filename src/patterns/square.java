package patterns;

public class square {
	public static void main(String[] args) {
		// Outer loop for rows
		for (int i = 1; i <= 5; i++) {
			// Inner loop for columns
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			// Move to the next line after printing each row
			System.out.println();
		}
	}
}
