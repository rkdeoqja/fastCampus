package chapter9;

public class QuickSort implements Sort{

	@Override
	public void ascending(int[] arr) {
		System.out.println("QuickSort ascending");
	}

	@Override
	public void discending(int[] arr) {
		System.out.println("QuickSort discending ");
	}
	
	@Override
	public void description() {
		Sort.super.description();
		System.out.println("QuickSort ¿‘¥œ¥Ÿ.");
	}
}
