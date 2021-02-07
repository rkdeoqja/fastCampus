package Practice;

public class Q2 {

	
	public static void main(String arg[]) {
		
		System.out.println("홀수값을 입력하세요");
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		int lineCount = sc.nextInt();
		int spaceCount = lineCount/2 + 1;
		int starCount = 1;
		
		if(lineCount%2==0)  {
			System.out.println("짝수값을 입력하셨습니다");
		}else {
			for(int i = 1;i<=lineCount;i++) {
				if(spaceCount>=i) {
					for(int space = spaceCount;space>i;space--) {
						System.out.print(" ");
					}
					for(int star=starCount;star<=i;star++) {
						System.out.print("*");
					}
					if(i>1) {
						for(int starr=2;starr<=i;starr++) {
							System.out.print("*");
						}
					}
					System.out.println();
				}else {
					for(int sp=spaceCount+1;sp<=i;sp++) {
						System.out.print(" ");
					}
					for(int st=lineCount;st>=i;st--) {
						
						System.out.print("*");
					}
					for(int stt=i;stt<lineCount;stt++) {
						System.out.print("*");
					}
					System.out.println();
				}
			}
		}
	}
}
