package loopExample;

public class ContinueExample {

	public static void main(String[] args) {

		for (int dan = 2; dan<10; dan+=2) {
			for (int num = 1; num<=dan; num++) {
				System.out.println(dan + " x " + num + " = " + dan*num);
			}
			System.out.println();
		}
	}

}
