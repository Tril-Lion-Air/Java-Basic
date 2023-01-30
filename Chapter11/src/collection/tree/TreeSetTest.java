package collection.tree;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("Clara");
		treeSet.add("Dennis");
		treeSet.add("Bob");
		
		for (String str : treeSet) {
			System.out.println(str);
		}
		
	}

}
