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
		addMember("��Ÿ",name,tel);
		
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
		//"ȸ��" "��븮" "010-123-1234
				PhoneBook pb = new PhoneBook();
		
				pb.addMember("ģ��","����","010-1111-1111");
				pb.addMember("ģ��","�ڻ��","010-2222-2222");
				pb.addMember("ģ��","ȫ���","010-3333-3333");
				pb.addMember("ȸ��","�ڻ��","010-1234-1234");
				pb.addMember("ȸ��","��븮","010-4444-4444");
				pb.addMember("ȸ��","�ִ븮","010-5555-5555");
				pb.addMember("ȸ��","�̰���","010-6666-6666");
				pb.addMember("ȸ��","�ں���","010-7777-7777");
				pb.addMember("Ŀ�Ǽ�","010-9999-9999");
				
				pb.printList();
				
	}

}
