package sort;

public interface Sort {
	
	void ascending(int[] arr);
	void decending(int[] arr);
	
	default void description() {
		System.out.println("This is an algorithm to sort numbers.");
	}
}
