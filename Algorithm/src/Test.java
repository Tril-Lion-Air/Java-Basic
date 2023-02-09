import java.util.*;
import java.io.*;

public class Test {

	public static void main(String[] args) throws Exception {
		
		int[] intArr = {1,2,3,4};
		int sum = Arrays.stream(intArr).sum();
		System.out.println(sum);
		
		int[][] intArr2D = {{1,2,3,4}, {1,2,3,4}, {1,2,3,4}};
//		int sum2 = Arrays.stream(iArr2D).sum(); // 2차원에서 IntStream.sum() 사용 불가
		int sum2 = Arrays.stream(intArr2D)
				.flatMapToInt(list -> Arrays.stream(list)) // flatMapToInt
				.sum();
		System.out.println(sum2);
		
		int sum3 = Arrays.asList(intArr2D).stream() // List로 변환 
				.flatMapToInt(list -> Arrays.stream(list)) // flatMapToInt
				.sum();
		System.out.println(sum3);
		
		Integer[] integerArr = {1,2,3,4};
//		int sum4 = Arrays.stream(integerArr).sum(); // Integer[] 에서 IntStream.sum() 사용 불가 
		int sum4 = Arrays.stream(integerArr).
				mapToInt(i -> i) // mapToInt를 이용해서 int[]로 변환.
				.sum();
		System.out.println(sum4);

		Integer[][] integerArr2D = {{1,2,3,4}, {1,2,3,4}, {1,2,3,4}};
//		int sum5 = Arrays.stream(integerArr2D)
//				.flatMap(list -> Arrays.stream(list)) 
//				.sum(); //IntStream.sum() 사용불가 
//		int sum5 = Arrays.stream(integerArr2D)
//				.flatMapToInt(list -> Arrays.stream(list)) // cannot convert from Stream<Integer> to IntStream
//				.sum();
//		int sum5 = Arrays.asList(integerArr2D).stream() // List로 변환 
//				.flatMapToInt(list -> Arrays.stream(list)) // cannot convert from Stream<Integer> to IntStream
//				.sum();
		int sum5 = Arrays.stream(integerArr2D)
				.flatMap(list -> Arrays.stream(list)) 
				.reduce(0, Integer::sum); //sum 대신 reduce 이
		int sum6 = Arrays.asList(integerArr2D).stream() // List로 변환 
				.flatMap(list -> Arrays.stream(list))
				.reduce(0, Integer::sum); //sum 대신 reduce 이용 
		System.out.println(sum5);
		System.out.println(sum6);

	}
}
