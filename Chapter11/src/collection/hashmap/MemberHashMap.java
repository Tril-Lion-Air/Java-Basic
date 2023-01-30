package collection.hashmap;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

	private HashMap<Integer,Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer,Member>();
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId(), member);
	}
	
	public boolean removeMember(int memberId) {
		if (hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		System.out.println("The id is not exist.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
//		hashMap.values().iterator();
		
		while (ir.hasNext() ) {
			int key = ir.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
	
	public void showAllMemberByValue() {
		Iterator<Member> ir = hashMap.values().iterator();
		while (ir.hasNext() ) {
			Member member = ir.next();
			System.out.println(member);
		}
		System.out.println();
	}
}
