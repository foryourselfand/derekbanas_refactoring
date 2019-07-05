package L13_Command.Commands;

// Represents the methods that will change based off
// of different BillPayers

// Command: Calls the right executeCalculateBill method
// based on the BillPayer type

public interface Command {
	void executeCalculateBill(double amountDue);
}
