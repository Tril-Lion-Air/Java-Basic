package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest {

	public static void main(String[] args) {

		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("A.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
//			return; //return이 되더라도 finally는 무조건 수행됨.
		} finally {
			try {
				fis.close();
				System.out.println("finally");
			} catch (Exception e) {
				System.out.println(e);
			}
		}
		System.out.println("end");
	}

}
