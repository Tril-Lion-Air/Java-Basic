package lambda;

interface PrintString {
	void showString(String str);
}

public class LambdaTest {

	public static void main(String[] args) {


		PrintString lambdaStr = s->System.out.println(s);
		lambdaStr.showString("Test");
		
		showMyString(lambdaStr);
		
		PrintString test = returnString();
		test.showString("test3");
	}
	
	public static void showMyString(PrintString p) {
		p.showString("Test2");
	}
	
	public static PrintString returnString() {
		return s->System.out.println(s + "!");
	}

}
