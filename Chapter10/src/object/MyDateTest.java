package object;

class MyDate {
	
	int date;
	
	public MyDate(int date) {
		this.date = date;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MyDate) {
			MyDate day = (MyDate)obj;
			return this.date == day.date;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return date;
	}
	
	
}

public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate day1 = new MyDate(20230129);
		MyDate day2 = new MyDate(20230129);
		
		System.out.println(day1==day2);
		System.out.println(day1.equals(day2));
		
		System.out.println(day1.hashCode());
		System.out.println(day2.hashCode());
		
		System.out.println(System.identityHashCode(day1));
		System.out.println(System.identityHashCode(day2));
	}

}
