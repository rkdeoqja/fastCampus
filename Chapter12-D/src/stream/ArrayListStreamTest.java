package stream;

import java.util.List;
import java.util.stream.Stream;
import java.util.ArrayList;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		//컬랙션의 스트림 사용방법
		List<String> sList = new ArrayList<String>();
		
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s->System.out.print(s +" "));
		System.out.println();
		
		Stream<String> stream2 = sList.stream();
		stream2.forEach(ㅗ->System.out.print(ㅗ +" ")); //변수이름은 무엇으로 설정해도 이상없다
		System.out.println();
		
		
		sList.stream().sorted().forEach(s->System.out.print(s +" "));
		System.out.println();
		sList.stream().map(s->s.length()).forEach(n->System.out.println(n));
	}

}
