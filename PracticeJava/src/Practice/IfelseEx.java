package Practice;

import java.util.Scanner;

public class IfelseEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("성적을 입력하세요: ");
		int grade = scanner.nextInt();
		
		
		if(grade>=90) {
			System.out.println("A학점 입니다.");
		}else if(grade>=80) {
			System.out.println("B학점 입니다.");
		}else if(grade>=70) {
			System.out.println("C학점 입니다.");
		}else if(grade>=60) {
			System.out.println("D학점 입니다.");
		}else {
			System.out.println("F학점 입니다.");
		}
		
		
	}

}
