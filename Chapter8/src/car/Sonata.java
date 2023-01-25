package car;

public class Sonata extends Car {

	@Override
	public void start() {
		System.out.println("Sonata start");
	}

	@Override
	public void drive() {
		System.out.println("Sonata drive");
		
	}

	@Override
	public void stop() {
		System.out.println("Sonata stop");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Sonata trunOff");
		
	}
	

}
