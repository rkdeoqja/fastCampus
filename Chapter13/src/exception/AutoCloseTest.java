package exception;

public class AutoCloseTest {

	public static void main(String[] args) {
		AutoCloseObj obj= new AutoCloseObj();
				
		try(AutoCloseObj obj2= new AutoCloseObj()){
			throw new Exception();		
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
