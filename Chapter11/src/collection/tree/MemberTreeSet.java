package collection.tree;

import java.util.TreeSet;
import java.util.Iterator;

public class MemberTreeSet {

	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<>(new Member());
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberId) {
		
		Iterator<Member> ir = treeSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			if(member.getMemberId() == memberId) {
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId + "is not exist");
		return false;
	}
	
	public void showAllMember() {
		for(Member member: treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
