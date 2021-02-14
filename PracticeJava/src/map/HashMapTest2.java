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

		map.put("네오", 90);
		map.put("트리니티", 100);
		map.put("사이퍼", 95);
		map.put("모피어스", 88);
		map.put("스미스", 75);
		
		System.out.println(map);
		
/*		Iterator<Entry<String,Integer>> it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름: "+e.getKey()+",점수: "+e.getValue());
		}
		Set eSet = map.entrySet();
		System.out.println(eSet);
		Set set = map.keySet();
		System.out.println("명단: "+set);
		
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
			System.out.println("이름: "+e.getKey()+", 점수: "+e.getValue());
			
		}
		
		Set<String> set2 = map.keySet();
		System.out.println("명단 2: "+set2);
		
		Collection<Integer> values = map.values();
		Iterator<Integer> iter = values.iterator();
		
		int total =0;
		
		while(iter.hasNext()) {
			Integer i = iter.next();
			total += i;
		}
		
		System.out.println("총점: "+total);
		System.out.println("평균: "+(float)total/set.size());
		System.out.println("최고점수: "+Collections.max(values));
		System.out.println("최소점수: "+Collections.min(values));
		
	}

}
