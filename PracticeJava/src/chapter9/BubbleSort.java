package chapter9;

public class BubbleSort implements Sort{

	@Override
	public void ascending(int[] arr) {
		System.out.println("BubbleSort ascending");
	}

	@Override
	public void discending(int[] arr) {
		System.out.println("BubbleSort discending");
	}

	@Override
	public void description() {
		Sort.super.description();
		System.out.println("BubbleSort ¿‘¥œ¥Ÿ.");
	}
	
	
}
