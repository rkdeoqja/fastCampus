package chapter11;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapTest {

	public static void main(String[] args) {
		
		
		HashMap<String,Integer> hashMap = new HashMap<String,Integer>();
		
		hashMap.put("유재석", new Integer(0));
		hashMap.put("박명수", new Integer(0));
		hashMap.put("정준하", new Integer(0));
		hashMap.put("정형돈", new Integer(0));
		hashMap.put("노홍철", new Integer(0));
		hashMap.put("하하", new Integer(0));
		
		Iterator<String> it = hashMap.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			Integer hs = hashMap.get(key);
			System.out.println(hs);
			
		}
	}

}
