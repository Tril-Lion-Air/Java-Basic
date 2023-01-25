package interfaceEx;

public class CalcTest {
	public static void main(String args[]) {
		Calc calc = new CompleteCalculator();
		int n1 = 10;
		int n2 = 2;
		
		System.out.println(calc.add(n1, n2));
		System.out.println(calc.substract(n1, n2));
		System.out.println(calc.times(n1, n2));
		System.out.println(calc.divide(n1, n2));
				
//		calc.showInfo(); //변수 타입이 Calc 이므로Calc 인터페이스에 있는 메서드만 사용가능.다운캐스팅 필
		calc.description();
		
		int[] arr = {1,2,3,4,5};
		int sum = Calc.total(arr);
		System.out.println(sum);
	}

}
