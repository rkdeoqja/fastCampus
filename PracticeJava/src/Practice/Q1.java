package Practice;

public class Q1 {
	
	public static void main(String[] args) {
		
		char operator = '/';
		int num1 = 10;
		int num2 = 5;
		
		if(operator == '+') {
			System.out.println(num1 + num2);
		}else if(operator == '-') {
			System.out.println(num1-num2);
			
		}else if(operator == 'x') {
			System.out.println(num1*num2);
		}else if(operator == '/') {
			System.out.println(num1/num2);
		}
		
		switch(operator){
			case '+':
				System.out.println(num1+num2);
				break;
			case '-':
				System.out.println(num1-num2);
				break;
			case 'x':
				System.out.println(num1*num2);
				break;
			case '/':
				System.out.println(num1/num2);
				break;
				
		}
	}
}
