package object;

class Student {
	
	int studentNum;
	String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object arg0) {
		
		if (arg0 instanceof Student) {
			Student std = (Student)arg0;
			
			return this.studentNum == std.studentNum;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return studentNum;
	}
	
}

public class EqualsTest {

	public static void main(String[] args) {

		String str1 = new String("abc");
		String str2 = "abc";
		
		System.out.println(str1==str2); // false 메모리 주소가 같은지 비교 
		System.out.println(str1.equals(str2)); // true 값이 같은지 비교 (String에서 재정의됨) 
		System.out.println("=================");
		
		Student lee = new Student(100, "LeeShin");
		Student lee2 = lee;
		Student shin = new Student(100, "LeeShin");
		
		System.out.println(lee == lee2);
		System.out.println(lee == shin);
		System.out.println(lee.equals(shin));
		
		System.out.println(lee.hashCode());
		System.out.println(lee2.hashCode());
		System.out.println(shin.hashCode());
		
		System.out.println(System.identityHashCode(lee));
		System.out.println(System.identityHashCode(lee2));
		System.out.println(System.identityHashCode(shin)); //실제 값은 다름.
	}

}
