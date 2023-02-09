import java.util.*;
import java.io.*;

public class Main {
	
	static int y, x; //세로: y, i 가로: x,j
	static Integer[][] pan; // arr[y][x]
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine().trim());
		
		y = Integer.parseInt(st.nextToken());
		x = Integer.parseInt(st.nextToken());
		pan = new Integer[y][x];
	
		for(int i=0; i<y;i++) {
			pan[i] = Arrays.stream(br.readLine().trim().split(" "))
					.map(s -> Integer.parseInt(s))
					.toArray(Integer[]::new);
		}
		
//		System.out.println(Arrays.deepToString(pan));
		// 입력 완료 
		
		int sumArr = Arrays.asList(pan).stream()
				.flatMap(list -> Arrays.stream(list))
				.reduce(0, Integer::sum);

		while (sumArr > 0) {
			
		}
		
		
    }
}