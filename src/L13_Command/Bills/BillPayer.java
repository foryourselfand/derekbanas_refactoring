package L13_Command.Bills;

// Represents all the different types of BillPayers
// and the methods used by them

public interface BillPayer {
	void calculateBill(double amountDue);
}