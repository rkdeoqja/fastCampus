package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapPhoneBook {
	public static HashMap phoneBook = new HashMap();
	
	public static void main(String[] args) {
		//"ȸ��" "��븮" "010-123-1234
		
		
		addMember("ģ��","����","010-1111-1111");
		addMember("ģ��","�ڻ��","010-2222-2222");
		addMember("ģ��","ȫ���","010-3333-3333");
		addMember("ȸ��","�ڻ��","010-1234-1234");
		addMember("ȸ��","��븮","010-4444-4444");
		addMember("ȸ��","�ִ븮","010-5555-5555");
		addMember("ȸ��","�̰���","010-6666-6666");
		addMember("ȸ��","�ں���","010-7777-7777");
		addMember("Ŀ�Ǽ�","010-9999-9999");
		
		printList();
		
		
	}
	
	public static void addGroup(String groupName) {
		if(!phoneBook.containsKey(groupName)) {
			phoneBook.put(groupName, new HashMap());
		}
	}
	
	public static void addMember(String groupName,String name,String tel) {
		addGroup(groupName);
		HashMap group = (HashMap)phoneBook.get(groupName);
		group.put(name, tel);
	}
	
	public static void addMember(String name,String tel) {
		addMember("��Ÿ",name,tel);
	}
	
	public static void printList() {
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