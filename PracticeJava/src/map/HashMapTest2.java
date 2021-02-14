package map;

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
		
		Iterator<Entry<String,Integer>> it = map.entrySet().iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름: "+e.getKey()+",점수: "+e.getValue());
		}
		Set eSet = map.entrySet();
		System.out.println(eSet);
		Set kSet = map.keySet();
		System.out.println("명단: "+kSet);
	}

}
