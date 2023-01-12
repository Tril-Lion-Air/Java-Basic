package arrayListPractice2;

import java.util.ArrayList;

public class Student {

	private String name;
	private ArrayList<Book> books = new ArrayList<Book>();
	
	public Student() {}

	public Student(String name) {
		super();
		this.name = name;
	}
	
	public void addBook(String title) {
		Book book = new Book(title);  //인스턴스를 일일히 만들고 add 해야한다.
		books.add(book);
	}
	
	public void showStudentInfo() {
		
		System.out.print(name + " 학생이 읽은 책은 : " );
		for (Book book : books) {
			System.out.print(book.getTitle() + " ");
		}
		System.out.println("입니다");
	}

	
	
	
}
