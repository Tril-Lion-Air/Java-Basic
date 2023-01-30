package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		set.add("Lee");
		set.add("Kim");
		set.add("Kang");
		System.out.println(set);
		
		Iterator<String> ir = set.iterator();
		
		while(ir.hasNext()) {
			String str = ir.next();
			System.out.println(str);
		}
	}

}
