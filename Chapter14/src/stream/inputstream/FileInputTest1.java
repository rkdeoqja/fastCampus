package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest1 {
	
	public static void main(String[] args) {
		
		
		
		try (FileInputStream fis = new FileInputStream("input.txt");){
			int i; 
			while((i =fis.read()) !=-1) {
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
	}
}