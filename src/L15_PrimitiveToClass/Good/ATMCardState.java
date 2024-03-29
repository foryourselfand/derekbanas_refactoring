package L15_PrimitiveToClass.Good;

// Represents the state of a ATMAccess object

public class ATMCardState {
	// These type safe constants live in the class and can't be impersonated
	public final static ATMCardState CARD_ENTERED = new ATMCardState("CARD ENTERED");
	public final static ATMCardState VALID_CARD = new ATMCardState("VALID CARD");
	public final static ATMCardState VALID_PIN = new ATMCardState("VALID PIN");
	public final static ATMCardState VALID_CASH_REQUEST = new ATMCardState("VALID CASH REQUEST");
	public final static ATMCardState DENIED = new ATMCardState("DENIED");

	public final static int CARD_NUMBER = 123456789;
	public final static int PIN_NUMBER = 1234;
	public final static double CARD_BALANCE = 1000.00;

	private final String name;

	private ATMCardState(String name) {
		this.name = name;
	}

	public String toString() {
		return name;
	}
}
