package chapter9;

public interface Sort {
	
	void ascending(int[] arr);
	void discending(int[] arr);
	
	default void description() {
		System.out.println("���ڸ� �����ϴ� �˰����Դϴ�.");
	}

}
