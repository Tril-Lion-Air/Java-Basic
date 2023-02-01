package lambda;

public class StiringConcatTest {

	public static void main(String[] args) {

		StringConImple impl = new StringConImple();
		impl.makeString("hello", "would");
		
		StringConcat concat = (s,v) ->System.out.println(s + ", " + v);
		concat.makeString("hello", "world");
		
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {

				System.out.println(s1 + ", " + s2);
			}
		};
		
		concat2.makeString("hello", "world");
	}

}
