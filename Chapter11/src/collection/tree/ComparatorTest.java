package collection.tree;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return s1.compareTo(s2) *(-1);
	}
	
	
}

public class ComparatorTest {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>(new MyCompare());
		treeSet.add("Clara");
		treeSet.add("Dennis");
		treeSet.add("Bob");
		
		for (String str : treeSet) {
			System.out.println(str);
		}
	}

}
