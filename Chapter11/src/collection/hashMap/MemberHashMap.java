package collection.hashMap;

import java.util.HashMap;
import java.util.Iterator;



public class MemberHashMap {

	
	private HashMap<Integer,Member> hashMap;
	
	public MemberHashMap() {
		hashMap = new HashMap<Integer,Member>();
		
	}
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberID(), member);
	}
	
	public boolean removeMember(int memberID) {
		if(hashMap.containsKey(memberID)) {
			hashMap.remove(memberID);
			return true;
		}
		System.out.println("ȸ�� ��ȣ�� �����ϴ�.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> it = hashMap.keySet().iterator();
		//hashMap.values().iterator();//value������ ��ȸ
		while(it.hasNext()) {
			int key = it.next();
			Member member = hashMap.get(key);
			System.out.println(member);
		}
		
		System.out.println();
	}
}
