package bookshelf;

public class BookShelfTest {

	public static void main(String[] args) {

		Queue bookQueue = new BookShelf();
		bookQueue.enQueue("TaeBack 1");
		bookQueue.enQueue("TaeBack 2");
		bookQueue.enQueue("TaeBack 3");
		
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
		System.out.println(bookQueue.deQueue());
	}

}
