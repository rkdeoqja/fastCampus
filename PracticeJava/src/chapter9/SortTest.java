package chapter9;
import java.io.IOException;;

public class SortTest {

	public static void main(String[] args) throws IOException{
		
		System.out.println("���Ĺ���� �����ϼ���");
		System.out.println("B: Bubble Sort");
		System.out.println("H: Heap Sort");
		System.out.println("Q: Quick Sort");
		
		int ch = System.in.read();
		
		Sort sort = null;
		
		if(ch =='B' || ch == 'b') {
			sort = new BubbleSort();
		}else if(ch == 'H' || ch == 'h') {
			sort = new HeapSort();
		}else if(ch == 'Q' || ch=='q') {
			sort = new QuickSort();
		}else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
		
		int[] arr = {1,2,3,4,5};
		
		sort.ascending(arr);
		sort.discending(arr);
		sort.description();
	}

}
