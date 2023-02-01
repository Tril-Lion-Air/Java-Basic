package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;



public class TravelTest {

	public static void main(String[] args) {

		TravelCustomer customerLee = new TravelCustomer("Lee", 40, 100);
		TravelCustomer customerKim = new TravelCustomer("Kim", 30, 100);
		TravelCustomer customerHong = new TravelCustomer("Hong", 13, 50);
		
		List<TravelCustomer> customerList = new ArrayList<>();
		
		customerList.add(customerLee);
		customerList.add(customerKim);
		customerList.add(customerHong);
		
		System.out.println(customerList);
		
		customerList.stream().map(c->c.getName()).forEach(s->System.out.println(s));
		int total = customerList.stream().mapToInt(c-> c.getPrice()).sum();
		System.out.println(total);
		
		customerList.stream().filter(c->c.getAge() >= 20).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
	}

}
