package generic;

public class Plastic extends Material {

	@Override
	public String toString() {
		return "This is plastic.";
	}

	@Override
	public void doPrinting() {
		System.out.println("Plastic printing");
	}
	
	
}
