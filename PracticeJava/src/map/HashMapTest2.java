package map;

import java.util.Collection;
import java.util.Collections;
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
		
/*		Iterator<Entry<String,Integer>> it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("�̸�: "+e.getKey()+",����: "+e.getValue());
		}
		Set eSet = map.entrySet();
		System.out.println(eSet);
		Set set = map.keySet();
		System.out.println("���: "+set);
		
		Collection values = map.values();
		Iterator iter = values.iterator();
		
		int total = 0;
		while(iter.hasNext()) {
			Integer i = (Integer)iter.next();
			total += i.intValue();
		}
*/	
		Set<Entry<String,Integer>> set = map.entrySet();
		Iterator<Entry<String,Integer>> iterator= set.iterator();
		
		while(iterator.hasNext()) {
			Map.Entry<String, Integer> e = iterator.next();
			System.out.println("�̸�: "+e.getKey()+", ����: "+e.getValue());
			
		}
		
		Set<String> set2 = map.keySet();
		System.out.println("��� 2: "+set2);
		
		Collection<Integer> values = map.values();
		Iterator<Integer> iter = values.iterator();
		
		int total =0;
		
		while(iter.hasNext()) {
			Integer i = iter.next();
			total += i;
		}
		
		System.out.println("����: "+total);
		System.out.println("���: "+(float)total/set.size());
		System.out.println("�ְ�����: "+Collections.max(values));
		System.out.println("�ּ�����: "+Collections.min(values));
		
	}

}
