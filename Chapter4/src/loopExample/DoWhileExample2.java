package loopExample;

public class DoWhileExample2 {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		do {
			sum += num++;
		}while(num <= 10);
		
		System.out.println(sum);
		System.out.println(num);
	}

}
