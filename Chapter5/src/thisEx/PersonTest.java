package thisEx;

public class PersonTest {

	public static void main(String[] args) {
		
		Person personNoName = new Person();
		personNoName.showPersonInfo();
		
		Person personLee = new Person("Lee", 20);
		personLee.showPersonInfo();
		System.out.println(personLee);
		
		Person p =personLee.getSelf();
		System.out.println(p);
	}
}
