package collection.treeSet;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return s1.compareTo(s2)*(-1);		//Comparator인터페이스의 내림차순 방식
	}
	
}

public class ComparatorTest {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>(/*new MyCompare()*/);//역순으로 정렬을 사용하기 위해 넣어준다
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");
		
		for(String s: treeSet) {
			System.out.println(s);
		}
		
	}

}
