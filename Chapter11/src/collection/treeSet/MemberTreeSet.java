package collection.treeSet;

import java.util.TreeSet;
import java.util.Iterator;

public class MemberTreeSet {
	
	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>(new Member()); 
		// Comparator�����ÿ��� �����ڿ� Comparator�� ������ ��ü�� �Ű������� �����ؾ��Ѵ�
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
		
		System.out.println(memberID+"�� �������� �ʽ��ϴ�.");
		return false;
		
		
	}
	
	public void showAllMember() {
		for(Member member : treeSet) {
			System.out.println(member);
		}
		System.out.println();
	}
}
