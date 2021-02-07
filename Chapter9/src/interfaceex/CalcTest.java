package interfaceex;


public class CalcTest {

	public static void main(String[] args) {
		
		CompleteCalc calc = new CompleteCalc();
		int n1 = 10;
		int n2 = 2;
		
		System.out.println(calc.add(n1, n2));
		System.out.println(calc.substract(n1, n2));
		System.out.println(calc.times(n1, n2));
		System.out.println(calc.divide(n1, n2));
		
		calc.showInfo();
		
		
		Calc calc2 = new CompleteCalc();
		
		System.out.println(calc2.add(n1, n2));
		
	//  Calc calc3 = new Calc();    
	//	Calc calc3 = new Calculator();
		
		calc.description();
		int[] arr = {1,2,3,4,5};
		
		int sum = Calc.total(arr);
		
		System.out.println(sum);
		
	}

}
