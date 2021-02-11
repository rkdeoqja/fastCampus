package collection.treeMap;

import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {
	
	private TreeMap<Integer,Member> treeMap;
	
	public MemberTreeMap() {
		treeMap = new TreeMap<Integer,Member>();
		
	}
	
	public void addMember(Member member) {
		treeMap.put(member.getMemberID(), member);
	}
	
	public boolean removeMember(int memberID) {
		if(treeMap.containsKey(memberID)) {
			treeMap.remove(memberID);
			return true;    
		}
		System.out.println("회원번호가 없습니다.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> it = treeMap.keySet().iterator();
		
		while(it.hasNext()) {
			int key = it.next();
			Member member = treeMap.get(key);
			System.out.println(member);
		}
		System.out.println();
	}
}
