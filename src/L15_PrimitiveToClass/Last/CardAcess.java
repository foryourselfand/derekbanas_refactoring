package L15_PrimitiveToClass.Last;

public class CardAcess {
	private Card card;

	public CardAcess(Card card) {
		this.card = card;
		this.card.state = CardState.CARD_ENTERED;
	}

	public CardState getState() {
		return card.state;
	}

	private void setState(CardState cardState) {
		card.state = cardState;
	}

	public void verifyCard(int cardNumber) {
		if (card.state == CardState.CARD_ENTERED) {
			if (cardNumber == Card.CARD_NUMBER)
				setState(CardState.VALID_CARD);
			else
				setState(CardState.DENIED);
		}

	}

	public void verifyPIN(int pinNumber) {
		if (card.state == CardState.VALID_CARD) {
			if (pinNumber == Card.PIN_NUMBER)
				setState(CardState.VALID_PIN);
			else
				setState(CardState.DENIED);
		}
	}

	public void verifyWithdrawalAmount(double withdrawalRequest) {
		if (card.state == CardState.VALID_PIN) {
			if (withdrawalRequest <= Card.CARD_BALANCE)
				setState(CardState.VALID_CASH_REQUEST);
			else
				setState(CardState.DENIED);
		}
	}
}
