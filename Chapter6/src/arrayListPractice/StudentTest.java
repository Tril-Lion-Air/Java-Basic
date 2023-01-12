package arrayListPractice;

public class StudentTest {

	public static void main(String[] args) {

		Student studentLee = new Student("Lee");
		studentLee.addSubjectNScore("국어", 100);
		studentLee.addSubjectNScore("수학", 90);
		studentLee.showStudentInfo();
		
		Student studentKim = new Student("Kim");
		studentKim.addSubjectNScore("국어", 10);
		studentKim.addSubjectNScore("수학", 9);
		studentKim.addSubjectNScore("영어", 6);
		studentKim.showStudentInfo();
		studentLee.showStudentInfo();
	}

}
