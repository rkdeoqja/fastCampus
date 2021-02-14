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
			System.out.println("ID와 PW를 입력해주세요 > ");
			System.out.println("ID >");
			String id = sc.nextLine().trim();
			
			System.out.println("PW >");
			String pw = sc.nextLine().trim();
			
			if(!map.containsKey(id)) {
				System.out.println("입력한 ID가 존재하지 않습니다.");
				continue;
			}else {
				if(!map.get(id).equals(pw)) {
					System.out.println("입력한 비밀번호와 맞지않습니다");
				}else {
					System.out.println("id와  pw가 일치합니다.");
					break;
				}
			}
		}
	}

}
