package collection;

import java.util.ArrayList;

class MyQueue{
	
	ArrayList<String> arrayQueue = new ArrayList<String>();
	
	public void enQueue(String s) {
		 arrayQueue.add(s);
	}
	
	public String deQueue() {
		
		int len = arrayQueue.size();
		if(len == 0) {
			System.out.println("ť�� �����Ͱ� �����ϴ�.");
			return null;
		}
		return arrayQueue.remove(0);
		
		}
	}
	

public class QueueTest {

	public static void main(String[] args) {
		
		MyQueue queue = new MyQueue();
		
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		
	}

}
