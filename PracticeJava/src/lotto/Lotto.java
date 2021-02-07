package lotto;

public class Lotto {
	
	public static void main(String[] args) {
		
		for(int j =0;j<5;j++) {
			
		for(int i = 0;i<6;i++) {
			int lotto = (int)(Math.random()*45)+1;
		
				System.out.print(lotto);
			
			if(i==5) {
				break;
			}
			System.out.print(",");
		}
		System.out.println();
		}
		
	}

}
