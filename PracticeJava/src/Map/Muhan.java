package Map;

import java.util.HashMap;

public class Muhan {
	
	public static void main(String[] args) {
		
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("���缮", new Integer(95));
		map.put("�ڸ��",100);
		map.put("������", 85);
		map.put("������",93);
		map.put("��ȫö",70);
		map.put("����",20);
		
		System.out.println(map);
		
		Integer num = map.get("��ȫö");
		System.out.println("��ȫö: "+num);
		
		map.put("��", 40);
		System.out.println(map);
		
		map.put(null, 99);
		System.out.println(map);
		map.put(null,999);			//key���� �ߺ��� ��������ʾ� �̹� �ִ� null�� value���� �ٲ���� �˼��ִ�
		System.out.println(map);
		
		map.put("����", null);		//�ݴ�� value�� ���� �ߺ��� �Ǵ��ȵǴ� ����� ���°��� �����ִ�
		System.out.println(map);
		map.put("Ȳ����", null);
		map.put("�缼��", null);
		System.out.println(map);
		
		
	}
}
