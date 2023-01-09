package coffee;

public class BeanCoffee {
	
	private String menu;
	private int price;
	
	public BeanCoffee() {
		this("라떼", 4500);
	}
	public BeanCoffee(String menu, int price) {
		this.menu = menu;
		this.price = price;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
