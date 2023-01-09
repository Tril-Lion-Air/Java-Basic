package coffee;

public class StarCoffee {
	
	private String menu;
	private int price;
	
	public StarCoffee() {
		this("아메리카노", 4000);
	}
	public StarCoffee(String menu, int price) {
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
