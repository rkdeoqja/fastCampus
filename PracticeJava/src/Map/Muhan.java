package Map;

import java.util.HashMap;

public class Muhan {
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("유재석", new Integer(95));
		map.put("박명수",100);
		map.put("정준하", 85);
		map.put("정형돈",93);
		map.put("노홍철",70);
		map.put("하하",20);
		
		System.out.println(map);
		
		Integer num = map.get("노홍철");
		System.out.println("노홍철: "+num);
		
		map.put("길", 40);
		System.out.println(map);
		
		map.put(null, 99);
		System.out.println(map);
		map.put(null,999);			//key값의 중복을 허용하지않아 이미 있던 null의 value값이 바뀐것을 알수있다
		System.out.println(map);
		
		map.put("전진", null);		//반대로 value의 값은 중복이 되던안되던 상관이 없는것을 볼수있다
		System.out.println(map);
		map.put("황광희", null);
		map.put("양세형", null);
		System.out.println(map);
		
		
	}
}
