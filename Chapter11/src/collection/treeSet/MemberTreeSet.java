package collection.treeSet;

import java.util.TreeSet;
import java.util.Iterator;

public class MemberTreeSet {
	
	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>(new Member()); 
		// Comparator구현시에만 생성자에 Comparator를 구현한 객체를 매개변수로 전달해야한다
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public boolean removeMember(int memberID) {
		
		Iterator<Member> it = treeSet.iterator();
		
		
		while(it.hasNext()) {
			Member member = it.next();
			if(member.getMemberID() == memberID) {
				treeSet.remove(member);
				return true;
			}
		}
		
		System.out.println(memberID+"가 존재하지 않습니다.");
		return false;
		
		
	}
	
	public void showAllMember() {
		for(Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
