package L13_Command;

import L13_Command.Commands.Command;

// This is the invoker. When returnFinalBill() is called
// it executes the right executeCalculateBill() based
// on the object type stored in theCommand

// This invoker can except numerous Command types and
// then execute different methods based on the Command
// type, but here it is limited to just one

public class CashRegister {

	private Command theCommand;

	public CashRegister(Command newCommand) {
		theCommand = newCommand;
	}

	public void setTheCommand(Command theCommand) {
		this.theCommand = theCommand;
	}

	public void returnFinalBill(double amountDue) {
		theCommand.executeCalculateBill(amountDue);
	}
}
