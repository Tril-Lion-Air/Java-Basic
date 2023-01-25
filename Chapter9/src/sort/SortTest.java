package sort;

import java.io.IOException;

public class SortTest {

	public static void main(String[] args) throws IOException {

		
		System.out.println("Select a Sorting mode."
				+ "\n B: Bubble Sort"
				+ "\n H: Heap Sort"
				+ "\n Q: Quick Sort");
		
		Sort sort = null;
		
		int ch = System.in.read();
		
		if (ch == 'H' || ch == 'h') {
			sort = new HeapSort();
		}
		else if (ch == 'B' || ch == 'b') {
			sort = new BubbleSort();
		}
		else if (ch == 'Q' || ch == 'q') {
			sort = new QuickSort();
		}
		
		sort.ascending(null);
		sort.decending(null);
		sort.description();
	}

}
