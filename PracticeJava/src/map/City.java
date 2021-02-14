package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class City {

	public static void main(String[] args) {
		String[] city = {"seoul","New York","London","Paris","Berlin","Tokyo","Hanoi"};
		
	/*	HashMap<Integer,String> map = new HashMap<Integer,String>();
		
		for(int i=0;i<city.length;i++) {
			map.put(i, city[i]);
		}
		System.out.println(map);
		
		Set<Integer> set = map.keySet();
		Iterator<Integer> ir = set.iterator();
		
		Iterator<Integer> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			Integer key = it.next();
			System.out.println(key +" : "+map.get(key));
		*/	
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		for(int i=0;i<city.length;i++) {
			map.put(city[i], i);
		}
		
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key +" : "+map.get(key));
		}
	}

}
