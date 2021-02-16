package lamda;

public class TestStringConcat {

	public static void main(String[] args) {
		
		
		StringConImpl impl = new StringConImpl();
		impl.makeString("Hello", "World");
		
		StringConcat con = (s1,s2)-> System.out.println(s1+","+s2);
		con.makeString("Hello", "World");
		
		StringConcat concat2 = new StringConcat() {

			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+","+s2);
				
			}
			
		};
		
		concat2.makeString("hello", "World");
		
	}

}
