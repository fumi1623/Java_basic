package ep2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class IfTest2 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int a = Integer.parseInt(s);
		if (10 < a)
			System.out.println("大きい");
			System.out.println("常に実行される");
	}
}
