package stream.inputstream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		
		System.out.println("�Է�.");
		
		try {
			int i ;
			
			while((i= System.in.read()) != '\n') {
				System.out.println((char)i);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
