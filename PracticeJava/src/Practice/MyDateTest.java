package Practice;

public class MyDateTest {

	public static void main(String[] args) {
		MyDate md = new MyDate(30,2,2000);
		md.isValid();
		MyDate md2 = new MyDate(2,10,2006);
		md2.isValid();
	}

}
