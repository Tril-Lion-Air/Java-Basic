package abstractEx;

public class ComputerTest {

	public static void main(String[] args) {

//		Computer computer = new Computer(); 오류!
		Computer computer = new Desktop();
		computer.display();
		computer.turnOff();

		Computer myNote = new MyNoteBook();
	}

}
