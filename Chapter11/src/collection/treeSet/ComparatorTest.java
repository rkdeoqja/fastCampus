package collection.treeSet;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		// TODO Auto-generated method stub
		return s1.compareTo(s2)*(-1);		//Comparator�������̽��� �������� ���
	}
	
}

public class ComparatorTest {

	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<String>(/*new MyCompare()*/);//�������� ������ ����ϱ� ���� �־��ش�
		treeSet.add("ȫ�浿");
		treeSet.add("������");
		treeSet.add("�̼���");
		
		for(String s: treeSet) {
			System.out.println(s);
		}
		
	}

}
