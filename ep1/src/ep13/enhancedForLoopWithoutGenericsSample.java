package ep13;

import java.util.ArrayList;
import java.util.List;

public class enhancedForLoopWithoutGenericsSample {
	public static void main(String[] args) {
//		List list = new ArrayList();
		List<String> list = new ArrayList<>();
		list.add("A");
		list.add("B");
		list.add("C");
//		for (Object obj : list) {
//			String str = (String) obj;
//			System.out.println(str);
//		}
		for (String str : list) {
			System.out.println(str);
		}
	}
}
