package Practice;

import java.util.Scanner;

public class IfelseEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���: ");
		int grade = scanner.nextInt();
		
		
		if(grade>=90) {
			System.out.println("A���� �Դϴ�.");
		}else if(grade>=80) {
			System.out.println("B���� �Դϴ�.");
		}else if(grade>=70) {
			System.out.println("C���� �Դϴ�.");
		}else if(grade>=60) {
			System.out.println("D���� �Դϴ�.");
		}else {
			System.out.println("F���� �Դϴ�.");
		}
		
		
	}

}
