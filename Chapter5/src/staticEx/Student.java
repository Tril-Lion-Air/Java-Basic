package staticEx;

public class Student {

	private static int serialNum = 1000;
	private int id;
	public String name;
	
	
	
	public Student(String name) {
		this.name = name;
		serialNum++;
		id = serialNum;
	}



	public Student(int id, String name, String address) {
		this.id = id;
		this.name = name;
		serialNum++;
		this.id = serialNum;

	}
	public String getname() {
		return name;
	}
	
	public int getId() {
		return id;
	}



	public static int getSerialNum() {
		return serialNum;
	}



	public static void setSerialNum(int serialNum) {
		Student.serialNum = serialNum;
	}
	
	


	
	
	
	
}
