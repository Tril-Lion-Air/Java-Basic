package staticEx;

public class Card {
	
	private static int serialNum = 10000;
	private int cardNumber;

	public Card() {
		cardNumber = ++serialNum;
	}
	
	
	public int getCardNumber() {
		return cardNumber;
	}
}
