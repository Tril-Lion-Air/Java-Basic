package collection.treemap;

public class MemberTreeMapTest {

	public static void main(String[] args) {

		MemberTreeMap manager = new MemberTreeMap();
		
		Member memberLee = new Member(300, "Lee");
		Member memberKim = new Member(200, "Kim");
		Member memberPark = new Member(100, "Park");
		Member memberPark2 = new Member(400, "Park2");
		
		manager.addMember(memberLee);
		manager.addMember(memberKim);
		manager.addMember(memberPark);
		manager.addMember(memberPark2);
		
		manager.showAllMember();
//		
//		manager.removeMember(200);
//		manager.showAllMember();		
		
	}

}
