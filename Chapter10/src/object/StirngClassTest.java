package object;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class StirngClassTest {

	public static void main(String[] args) throws ClassNotFoundException {

//		Class c1 = String.class;
//		
//		String str = new String();
//		Class c2 = str.getClass();
//		
		Class c3 = Class.forName("java.lang.String");
		
//		System.out.println(c1);
//		System.out.println(c2);
		System.out.println(c3);
		
		Constructor[] cons = c3.getConstructors();
		for (Constructor con: cons) {
			System.out.println(con);
		}
		
		System.out.println();
		
		Method[] methods = c3.getMethods();
		for (Method method: methods) {
			System.out.println(method);
		}
		
	}

}
