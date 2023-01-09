package referenceDataType;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student(100,"Lee");
		studentLee.korean.setSubjectName("국어", 100);
		studentLee.math.setSubjectName("수학", 90);
		
		Student studentKim = new Student(101, "Kim");
		studentLee.korean.setSubjectName("국어", 100);
		studentLee.math.setSubjectName("수학", 90);
	}

}
