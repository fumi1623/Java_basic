package ep14;

public class StringSample {
	
	private final static String STR = "Hello, Java!";
	
	public static void main(String[] args) {
//		String a = "Hello, Java!";
//		String b = "Hello, Java!";
//		System.out.println(a == b);
		
//		String a = new String("Hello, Java!");
//		String b = new String("Hello, Java!");
//		System.out.println(a == b);
		
		String a = STR;
		String b = STR;
		System.out.println(a == b);
	}
}
