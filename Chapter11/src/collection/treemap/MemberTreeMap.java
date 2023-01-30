package collection.treemap;

import java.util.TreeMap;
import java.util.Iterator;

public class MemberTreeMap {

	private TreeMap<Integer,Member> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer,Member>();
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if (treeMap.containsKey(memberId)) {
			treeMap.remove(memberId);
			return true;
		}
		System.out.println("The id is not exist.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = treeMap.keySet().iterator();
//		treeMap.values().iterator();
		
		while (ir.hasNext() ) {
			int key = ir.next();
			Member member = treeMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
	
	public void showAllMemberByValue() {
		Iterator<Member> ir = treeMap.values().iterator();
		while (ir.hasNext() ) {
			Member member = ir.next();
			System.out.println(member);
		}
		System.out.println();
	}
}
