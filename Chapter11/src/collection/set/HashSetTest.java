package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		
		//ArrayList<String> set = new ArrayList<String>(); �ߺ���� ���������� ���
		
		
		HashSet<String> set = new HashSet<String>(); //�ߺ��� ������� ������ ������ �ұ�Ģ�ϴ�
		set.add("�̼���");
		set.add("������");
		set.add("������");
		set.add("�̼���");
		
		System.out.println(set);
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		
	}

}
