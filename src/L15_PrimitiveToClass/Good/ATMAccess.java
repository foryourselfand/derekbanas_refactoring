package L15_PrimitiveToClass.Good;
// Type safety is very important.
// We want to eliminate all operations on values that
// are not of the appropriate data type by protecting
// the program from bad input.

// We can do this by replacing primitive types with classes

public class ATMAccess {
	private ATMCardState cardState;

	public ATMAccess() {
		setState(ATMCardState.CARD_ENTERED);
	}

	public String getState() {
		return cardState.toString();
	}

	private void setState(ATMCardState cardState) {
		this.cardState = cardState;
	}

	public void verifyCard(int cardNumber) {
		if (getState().equals(ATMCardState.CARD_ENTERED.toString())) {
			if (cardNumber == ATMCardState.CARD_NUMBER)
				setState(ATMCardState.VALID_CARD);
			else
				setState(ATMCardState.DENIED);
		}

	}

	public void verifyPIN(int pinNumber) {
		if (getState().equals(ATMCardState.VALID_CARD.toString())) {
			if (pinNumber == ATMCardState.PIN_NUMBER)
				setState(ATMCardState.VALID_PIN);
			else
				setState(ATMCardState.DENIED);
		}
	}

	public void verifyWithdrawalAmount(double withdrawalRequest) {
		if (getState().equals(ATMCardState.VALID_PIN.toString())) {
			if (withdrawalRequest <= ATMCardState.CARD_BALANCE)
				setState(ATMCardState.VALID_CASH_REQUEST);
			else
				setState(ATMCardState.DENIED);
		}
	}
}
