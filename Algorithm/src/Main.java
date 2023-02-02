import java.util.*;
import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		
		List<Integer> iList1 = new ArrayList<>();
		for(int i=1;i<=5;i++) {
			iList1.add(i);

		}
		
		int[] iArr = {1, 2, 3, 4, 5};
//		List<Integer> iList2 = new ArrayList<>(Arrays.asList());
//		list2.add(6);
		List list = Arrays.asList(iArr);
		System.out.println(list.get(0));
		

		
		List<String> sList1 = new ArrayList<String>(Arrays.asList("1","2","3","4","5"));
		List<String> sList2 = Arrays.asList("11","2222","33","44","55");
		
		List<Integer> sList3 = new ArrayList<>(Arrays.asList(1,2,3,4,5));

		
		System.out.println(iList1.toString());
//		System.out.println(iLst2.toString());

		System.out.println(sList1);
		System.out.println(sList2);
		System.out.println(sList3.get(0) + sList3.get(1));
		
	}
}
