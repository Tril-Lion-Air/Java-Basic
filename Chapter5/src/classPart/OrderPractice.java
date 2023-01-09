package classPart;

public class OrderPractice {

	public static void main(String[] args) {

		Order order = new Order();
		order.orderNumber = "201907210001";
		order.orderID = "abc123";
		order.orderDate = "2019년 7월 21";
		order.orderName = "홍길순";
		order.orderBoxNumber = "PD0345-12";
		order.address = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호: " + order.orderNumber
				+ "\n주문자 아이디: "+order.orderID);
	}

}
