package ep13;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GetIteratorSample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		set.add("A");
		set.add("B");
		set.add("C");
		set.add(null);
		
		Iterator<String> ite = set.iterator();
		while(ite.hasNext()) {
			String str = ite.next();
			System.out.println(str);
		}
	}

}
