package ep2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SwitchTest {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int a = Integer.parseInt(s);
		
		switch (a) {
		case 1:
			System.out.println("one");
			break;
		case 2:
			System.out.println("twe");
			break;
		default:
			System.out.println("other");
			break;
		}
	}
}
