package collection.treeMap;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		
		MemberTreeMap manager = new MemberTreeMap();
		
		Member memberKim = new Member(100,"Kim");
		Member memberLee = new Member(200,"Lee");
		Member memberPark = new Member(300,"Park");
		Member memberPark2 = new Member(400,"Park2");
		
		manager.addMember(memberLee);
		manager.addMember(memberPark);
		manager.addMember(memberKim);
		manager.addMember(memberPark2);
		
		manager.showAllMember();
		
		
	}

}
