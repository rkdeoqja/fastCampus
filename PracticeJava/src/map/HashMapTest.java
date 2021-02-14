package map;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("myId", "password");
		map.put("code", "2019");
		map.put("dragon", "2020");
		map.put("dragon", "2021");
		
		System.out.println("size: "+map.size());
		System.out.println(map);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("ID�� PW�� �Է����ּ��� > ");
			System.out.println("ID >");
			String id = sc.nextLine().trim();
			
			System.out.println("PW >");
			String pw = sc.nextLine().trim();
			
			if(!map.containsKey(id)) {
				System.out.println("�Է��� ID�� �������� �ʽ��ϴ�.");
				continue;
			}else {
				if(!map.get(id).equals(pw)) {
					System.out.println("�Է��� ��й�ȣ�� �����ʽ��ϴ�");
				}else {
					System.out.println("id��  pw�� ��ġ�մϴ�.");
					break;
				}
			}
		}
	}

}
