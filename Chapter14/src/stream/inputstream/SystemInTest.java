package stream.inputstream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest {

	public static void main(String[] args) {
		
		System.out.println("�Է� �� '��' �̶�� ������;");
		
		try {
			int i ;
			InputStreamReader isr = new InputStreamReader(System.in); 	// ����Ʈ ������ �ڷḦ ������ �ٽ� ���ڷ� �ٲپ��ִ� ��Ʈ��
			while((i= isr.read()) != '��') {
				System.out.print((char)i);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
