package inheritance;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customerLee = new Customer(10010, "이순신");
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
		customerKim.bonusPoint = 10000;
		
		Customer customerNo = new Customer(10030, "나몰라");
		customerKim.bonusPoint = 10000;

		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		int priceNo = customerKim.calcPrice(10000);
		
		System.out.println(customerLee.showCustomerInfo() + "지불금액은 "+  priceLee + "원 입니다.");
		System.out.println(customerKim.showCustomerInfo() + "지불금액은 "+  priceKim + "원 입니다.");
		System.out.println(customerNo.showCustomerInfo() + "지불금액은 "+  priceNo + "원 입니다.");
		
	}

}
