package interfaceEx;

public class CompleteCalculator extends Calculator{

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		if(num2==0) 
			return ERROR;
		else 
			return num1 / num2;
	}
	
	public void showInfo() {
		System.out.println("Implements complete"); 
	}

	@Override
	public void description() {
		System.out.println("Overrided description");
	}
	
	

}
