package generic;

public class Powder extends Material{

	@Override
	public String toString() {
		return "This is powder.";
	}

	@Override
	public void doPrinting() {

		System.out.println("Powder Printing");
	}

	
}
