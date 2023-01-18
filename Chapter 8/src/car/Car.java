package car;

public abstract class Car {
	
	abstract public void start();
	abstract public void drive();
	abstract public void stop();
	abstract public void turnOff();
	
	public void run() {
		start();
		drive();
		stop();
		turnOff();
	}

}
