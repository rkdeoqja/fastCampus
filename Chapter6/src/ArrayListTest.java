

import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		
		//ArrayList<String> list = new ArrayList<String>();
		ArrayList list = new ArrayList();
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
	/*	for(int i=0;i<list.size();i++) {		���׸�Ÿ���� �������־������� ���׸�Ÿ������ ������������  ���׸�Ÿ���� ���������ʾ�������25��° �ٰ� ���� ����ȯ�� ���־�� �Ѵ�
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
