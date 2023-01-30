import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		Stack<Integer> stack = new Stack<>(); 

		while (n-- > 0) {
			int temp = Integer.parseInt(br.readLine());
			
			if (temp == 0) stack.pop();
			else stack.push(temp);
		}
		
		int sum = 0;
		for (int num: stack) {
			sum += num;
		}
		
		System.out.println(sum);
	}
}
