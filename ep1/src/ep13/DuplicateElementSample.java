package ep13;

import java.util.HashSet;
//import java.util.ArrayList;
//import java.util.List;
import java.util.Set;

public class DuplicateElementSample {
	public static void main(String[] args) {
//		List<String> list = new ArrayList<>();
//		list.add("A");
//		list.add("B");
//		list.add("C");
//		list.add("A");
//		for (String str : list) {
//			System.out.println(str);
//		}
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("A");
		for (String str : set) {
			System.out.println(str);
		}
	}
}
