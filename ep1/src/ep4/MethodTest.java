package ep4;
//
public class MethodTest {
//	public static void main(String[] args) {
////		System.out.println("A");
////		sample();
//		
//		int a = 10;
//		test();
//	}
//	
////	public static void sample() {
////		System.out.println("B");
////	}
//	
//	public static void test(int num) {
//		System.out.println(num);
//	}
	
	
	public static void main(String[] args) {
		int val = returnableValue();
		System.out.println(val);
	}
	
	public static int returnableValue() {
		int tmp = 100;
		return tmp;
	}
}
