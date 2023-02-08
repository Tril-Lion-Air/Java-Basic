package thread;

class MyThread implements Runnable {
	
	public void run() {
		int i;
		
		for( i=0; i<=200; i++) {
			System.out.print(i + "\t");
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class ThreadTest {

	public static void main(String[] args) {

		System.out.println("start");
		MyThread th1 = new MyThread();
		MyThread th2 = new MyThread();
		
		Thread t1 = new Thread(th1);
		Thread t2 = new Thread(th2);
		
		t1.start();
		t2.start();
		
		System.out.println("end");
		
	}

}
