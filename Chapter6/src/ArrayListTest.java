

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		//ArrayList<String> list = new ArrayList<String>();
		ArrayList list = new ArrayList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
	/*	for(int i=0;i<list.size();i++) {		제네릭타입을 지정해주었을때는 제네릭타입으로 받을수있지만  제네릭타입을 지정하지않았을때는25번째 줄과 같이 형변환을 해주어야 한다
			String string = list.get(i);
			System.out.println(string);			
		} 
	
		  	for(String s :list) {
			System.out.println(s);
		}
		 * */
		for(int i=0;i<list.size();i++) {
			String string = (String)list.get(i);
			System.out.println(string);
		}
		for(Object s :list) {
			System.out.println(s);
		}
	}

}
