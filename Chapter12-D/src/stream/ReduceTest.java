package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length >=s2.getBytes().length)
			return s1;
		else return s2;
	}
	
	
}

public class ReduceTest {

	public static void main(String[] args) {
		
		String[] greetings = {"안녕하세요~~~","Hello","Good morning","반갑습니다"};
		
		//reduce()연산의 두가지사용법
		System.out.println(Arrays.stream(greetings).reduce("",(s1,s2)->{
			if(s1.getBytes().length >=s2.getBytes().length) {
				
				System.out.println("s1: "+s1+",s2: "+s2+", if");
				return s1;
			}
			else System.out.println("s1: "+s1+",s2: "+s2+", else"); return s2;
		}));
		
		//interface BinaryOperator을 이용한 사용법
		System.out.println(Arrays.stream(greetings).reduce(new CompareString()).get());
	}

}
