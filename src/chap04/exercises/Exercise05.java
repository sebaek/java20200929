package chap04.exercises;

public class Exercise05 {
	public static void main(String[] args) {
		// 4x + 5y = 60
		// 1, 1
		// 1, 2
		// 1, 3
		// :
		// 1, 10
		// 2, 1
		// 2, 2
		// :
		// 2, 10
		// :
		// 10, 10

		for (int x = 1; x <= 10; x++) {
			for (int y = 1; y <= 10; y++) {
				int s = (4 * x) + (5 * y);
				if (s == 60) {
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}
	}
}
