package stream.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest1 {

	public static void main(String[] args) {
		
																	//true�� �Ѱ��ָ� append �ȴ� 
		try(FileOutputStream fos = new FileOutputStream("output.txt",true)){
			
			fos.write(65);
			fos.write(66);
			fos.write(67);
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
