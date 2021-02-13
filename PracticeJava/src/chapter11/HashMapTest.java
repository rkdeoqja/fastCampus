package chapter11;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest {

	public static void main(String[] args) {
		
		
		HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
		
		hashMap.put("���缮", new Integer(0));
		hashMap.put("�ڸ��", new Integer(0));
		hashMap.put("������", new Integer(0));
		hashMap.put("������", new Integer(0));
		hashMap.put("��ȫö", new Integer(0));
		hashMap.put("����", new Integer(0));
		
		Iterator<String> it = hashMap.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			Integer hs = hashMap.get(key);
			System.out.println(hs);
			
		}
	}

}
