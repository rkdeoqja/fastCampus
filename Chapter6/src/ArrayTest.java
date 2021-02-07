
public class ArrayTest {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		int total=0;
		for(int i =0, num = 1 ;i<arr.length ;i++,num++) {
			arr[i] = num;
		}
		
		for(int i=0;i<arr.length;i++ ) {
			total += arr[i];
			System.out.println(total);
		}
		
		//char[] alpha = new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','N','M','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		
		
		char[] alpha = new char[26];
		
		
		for(int i=0,a = 65;i<alpha.length;i++,a++) {
			alpha[i]=(char)a;
		}
		
		for(int i=0;i<alpha.length;i++) {
			System.out.println(alpha[i]);
		}
		
		
		
	}

}
