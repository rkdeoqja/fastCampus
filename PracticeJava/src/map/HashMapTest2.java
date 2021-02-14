package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest2 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("�׿�", 90);
		map.put("Ʈ����Ƽ", 100);
		map.put("������", 95);
		map.put("���Ǿ", 88);
		map.put("���̽�", 75);
		
		System.out.println(map);
		
		Iterator<Entry<String,Integer>> it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("�̸�: "+e.getKey()+",����: "+e.getValue());
		}
		Set eSet = map.entrySet();
		System.out.println(eSet);
		Set kSet = map.keySet();
		System.out.println("���: "+kSet);
	}

}
