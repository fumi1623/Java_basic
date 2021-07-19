package ep4;

public class BreakTest {
	public static void main(String[] args) {
//		for (int i = 1; i < 5; i++) {
//			System.out.print(i);
//			if (i == 3) {
//				break;
//			}
//		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
				if (j == 2) {
					break;
				}
			}
			System.out.println();
		}
	}
}
