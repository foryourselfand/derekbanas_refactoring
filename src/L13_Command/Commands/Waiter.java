package L13_Command.Commands;

import L13_Command.Bills.BillPayer;

public class Waiter implements Command {
	private BillPayer thePayer;

	public Waiter(BillPayer thePayer) {
		this.thePayer = thePayer;
	}

	public void executeCalculateBill(double amountDue) {
		thePayer.calculateBill(amountDue);
	}
}