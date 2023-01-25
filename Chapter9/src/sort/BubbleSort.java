package sort;

public class BubbleSort implements Sort{

	@Override
	public void ascending(int[] arr) {
		System.out.println("BubbleSort ascending");
		
	}

	@Override
	public void decending(int[] arr) {
		System.out.println("BubbleSort decending");
		
	}

	@Override
	public void description() {
		// TODO Auto-generated method stub
		Sort.super.description();
		System.out.println("This is BubbleSort");

	}
	
	

}
