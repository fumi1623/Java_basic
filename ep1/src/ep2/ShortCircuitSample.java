package ep2;

public class ShortCircuitSample {
	public static void main(String[] args) {
		
		int a = 1;
		int i = 4;
		
//		if (a == 1 | i++ < 5) {
//			
//		}
//		
//		System.out.println(i);  // 5
		
		if (a == 1 || i++ < 5) {
			
		}
		
		System.out.println(i);  // 4
	}

}
