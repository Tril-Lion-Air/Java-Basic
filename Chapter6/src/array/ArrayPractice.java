package array;

public class ArrayPractice {

	public static void main(String[] args) {

		char[] alpahbets = new char[26];
		char ch = 'A';
		
		for(int i=0; i<alpahbets.length; i++) {
			alpahbets[i] = ch++;
			System.out.println(alpahbets[i]);
		}
	}

}
