package ineerclass;

class Outer2 {
	
	int outNum = 100;
	static int sNum = 200;
	
	public Runnable getRunnable(int i) {
		
		int num = 100;
		
		return new Runnable() {
			
			@Override
			public void run() {

				System.out.println(num);
				System.out.println(i);
				System.out.println(outNum);
				System.out.println(Outer2.sNum);
			}
			
		};
	}
	
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {

			System.out.println("test");
		}
	};
}

public class AnonymousInnerClassTest {

	public static void main(String[] args) {

		Outer2 outer = new Outer2();
		Runnable runnable = outer.getRunnable(50);
		runnable.run();
		
		outer.runner.run();
	}

}
