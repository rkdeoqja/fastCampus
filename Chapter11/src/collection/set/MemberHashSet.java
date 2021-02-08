package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class MemberHashSet {
	
	private HashSet<Member> hashSet;
	
	public MemberHashSet() {
		hashSet = new HashSet<Member>();
	}
	
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberID) {
		
		Iterator<Member> it = hashSet.iterator();
		
		
		while(it.hasNext()) {
			Member member = it.next();
			if(member.getMemberID() == memberID) {
				hashSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberID+"가 존재하지 않습니다.");
		return false;
		
		
	}
	
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
