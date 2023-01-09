package referenceDataType;

public class Student {
	
	int studentID;
	String studentName;
	
//	int koreaScore;
//	int mathScore;
//	int engScore;
//	
//	String koreaName;
//	String mathName;
//	String engName;
	
	Subject korean;
	Subject math;
	Subject eng;
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		
		korean = new Subject();
		math = new Subject();
	}
	
}
