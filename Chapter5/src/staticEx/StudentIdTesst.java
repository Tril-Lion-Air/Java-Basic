package staticEx;

public class StudentIdTesst {

	public static void main(String[] args) {
		
		System.out.println(Student.getSerialNum());

		Student studentLee = new Student("Lee");
		System.out.println(Student.getSerialNum());
		
		Student studentKim = new Student("Kim");
		System.out.println(Student.getSerialNum());

		System.out.println(studentLee.getId());
		System.out.println(studentKim.getId());

		}
}
