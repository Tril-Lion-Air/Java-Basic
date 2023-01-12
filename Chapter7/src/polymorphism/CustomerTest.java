package polymorphism;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();

		Customer customerKim = new VIPCustomer(10010,"Kim");
		Customer customerLee = new GoldCustomer(10020,"Lee");
		Customer customerPark = new GoldCustomer(10030,"Park");
		Customer customerChoi = new Customer(10040,"Choi");
		Customer customerJung = new Customer(10050,"Jung");
		
		customerList.add(customerKim);
		customerList.add(customerLee);
		customerList.add(customerPark);
		customerList.add(customerChoi);
		customerList.add(customerJung);
		
		for (Customer customer : customerList) {
			System.out.print(customer.calcPrice(10000) + " ");
			System.out.println(customer.bonusPoint);
		}
		
		
	}

}
