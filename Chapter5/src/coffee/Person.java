package coffee;

public class Person {

	private String name;
	private int money;
	
	public Person() {
		this("이름 없음", 0);
	}
	
	public Person(String name, int money) {
		this.name = name;
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	public void buyStarCoffee(StarCoffee starCoffee, int price){
		System.out.println(name + ", " + price + ", " + starCoffee.getMenu());
	}
	public void buyBeanCoffee(BeanCoffee beanCoffee, int price){
		System.out.println(name + ", " + price + ", " + beanCoffee.getMenu());
	}
	
	
	
}
