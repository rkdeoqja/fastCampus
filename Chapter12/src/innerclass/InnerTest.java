package innerclass;

class OutClass{
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
		
	}
	
	class InClass{
		int iNum = 100;
	// static int sInNum = 200; OutClass 생성자 호출이후에 생성되는 InClass이기 때문에  
	//	static 변수를 사용할수없다 사용하고싶다면 InClass도 static클래스로 만들어 줘야한다
		
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
		}
	 
	}
	
	public void usingInner() {
		inClass.inTest();
	}
	
	static class InStaticClass{
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println(inNum);
			System.out.println(sInNum);
			System.out.println(sNum);
		}
		 
		static void sTest() {
		//	System.out.println(inNum); 
			//static 메서드는 객체 생성전에도 사용가능하기때문에 생성후에 만들어지는 변수를 불러올수없다
			System.out.println(sInNum);
			System.out.println(sNum);
		}
	}
}

public class InnerTest {
	public static void main(String[] args) {
		
		OutClass outClass = new OutClass();
		outClass.usingInner();
		
		OutClass.InClass myInClass = outClass.new InClass();
		myInClass.inTest();
		
		System.out.println();
		
		OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
		sInClass.inTest();
		OutClass.InStaticClass.sTest();
	}
}
