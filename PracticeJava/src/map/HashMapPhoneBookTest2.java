package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

class PhoneBook{
	
	HashMap phoneBook;
	public PhoneBook() {
		phoneBook = new HashMap();
	}
	
	public void addGroup(String groupName) {
		if(!phoneBook.containsKey(groupName)) {
			phoneBook.put(groupName,new HashMap());
		}
	}
	
	public void addMember(String groupName,String name,String tel) {
		addGroup(groupName);
		HashMap group = (HashMap)phoneBook.get(groupName);
		group.put(name, tel);
		
	}
	public void addMember(String name,String tel) {
		addMember("기타",name,tel);
		
	}
	
	public void printList() {
		
		Set set = phoneBook.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			Set subSet = ((HashMap)e.getValue()).entrySet();
			Iterator subIt = subSet.iterator();
			System.out.println("*"+e.getKey()+"["+subSet.size()+"]");
			while(subIt.hasNext()) {
				Map.Entry subE = (Map.Entry)subIt.next();
				String name = (String)subE.getKey();
				String tel = (String)subE.getValue();
				
				System.out.println(name+" "+tel);
				
			}
			
			System.out.println();
			
		}
		
	}
	
}


public class HashMapPhoneBookTest2 {
	

	public static void main(String[] args) {
		//"회사" "김대리" "010-123-1234
				PhoneBook pb = new PhoneBook();
		
				pb.addMember("친구","김사원","010-1111-1111");
				pb.addMember("친구","박사원","010-2222-2222");
				pb.addMember("친구","홍사원","010-3333-3333");
				pb.addMember("회사","박사원","010-1234-1234");
				pb.addMember("회사","김대리","010-4444-4444");
				pb.addMember("회사","최대리","010-5555-5555");
				pb.addMember("회사","이과장","010-6666-6666");
				pb.addMember("회사","박부장","010-7777-7777");
				pb.addMember("커피숍","010-9999-9999");
				
				pb.printList();
				
	}

}
