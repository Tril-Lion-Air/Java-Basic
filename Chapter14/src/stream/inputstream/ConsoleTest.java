package stream.inputstream;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {

		Console console = System.console();
		
		System.out.println("name:");
		String name = console.readLine();
		System.out.println("password:");
		char[] password = console.readPassword();
		
		System.out.println(name);
		System.out.println(password); 
	}

}
