package stream.reader;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		
		//FileInputStream fis = new FileInputStream("reader.txt");
		//InputStreamReader isr = new InputStreamReader(fis);//이미 byte단위로 읽었다면 리더를 이용하여 변환해준다
		FileReader fis = new FileReader("reader.txt");//문자를 읽을때엔 FileReader를 사용한다
		
		int i;
		while( (i = fis.read()) != -1) {
			System.out.print((char)i);
		}
		
		fis.close();
	}

}
