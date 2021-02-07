package Practice;

import java.util.Scanner;

public class SwitchCaseEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
	
		int month = scanner.nextInt();
		int day = 31;
		switch(month) {
		 	case 1:
		 		day=31;
		 		System.out.println(month+"월은 "+day+"일 입니다.");
		 		break;
		 	case 2:
		 		day=28;
		 		System.out.println(month+"월은 "+day+"일 입니다.");
		 		break;
		 	case 3:
		 		day=31;
		 		System.out.println(month+"월은 "+day+"일 입니다.");
		 		break;
		 	case 4:
		 		day=30;
		 		System.out.println(month+"월은 "+day+"일 입니다.");
		 		break;
		 	case 5:
		 		day=31;
		 		System.out.println(month+"월은 "+day+"일 입니다.");
		 		break;
		 	case 6:
		 		day=30;
		 		System.out.println(month+"월은 "+day+"일 입니다.");
		 		break;
		 	case 7:
		 		day=31;
		 		System.out.println(month+"월은 "+day+"일 입니다.");
		 		break;
		 	case 8:
		 		day=31;
		 		System.out.println(month+"월은 "+day+"일 입니다.");
		 		
		 		break;
		 	case 9:
		 		day=30;
		 		System.out.println(month+"월은 "+day+"일 입니다.");
		 		
		 		break;
		 	case 10:
		 		day=31;
		 		System.out.println(month+"월은 "+day+"일 입니다.");
		 		break;
		 	case 11:
		 		day=30;
		 		System.out.println(month+"월은 "+day+"일 입니다.");
		 		break;
		 	case 12:
		 		day=31;
		 		System.out.println(month+"월은 "+day+"일 입니다.");
		 		break;
			
		}
		
		
	}

}
