package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		
		//ArrayList<String> set = new ArrayList<String>(); 중복허용 순차적으로 출력
		
		
		HashSet<String> set = new HashSet<String>(); //중복을 허용하지 않으며 순서가 불규칙하다
		set.add("이순신");
		set.add("김유신");
		set.add("강감찬");
		set.add("이순신");
		
		System.out.println(set);
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		
	}

}
