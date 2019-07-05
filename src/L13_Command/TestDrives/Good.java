package L13_Command.TestDrives;
import L13_Command.Bills.BillPayer;
import L13_Command.CashRegister;
import L13_Command.Commands.Waiter;
import L13_Command.CustomerGroup;
import L13_Command.CustomerTypePicker;


public class Good{
	public static void main(String[] args){
		// Get the customer to use for bill calculation
		BillPayer sallyMay = CustomerTypePicker.getWomanOver60();

		// The Waiter sets the customer type so that the right
		// executeCalculateBill method is called
		Waiter theWaiter = new Waiter(sallyMay);

		// The invoker makes sure the right method is called and
		// stores the Waiter so BillPayers assigned to Waiter
		// are available

		CashRegister calculateBill = new CashRegister(theWaiter);

		// When returnFinalBill() is called that signals that the
		// Waiter stored in CashRegister should execute method
		// executeCalculateBill

		calculateBill.returnFinalBill(12.00);

		BillPayer paulThumb = CustomerTypePicker.getManOver60();
		theWaiter = new Waiter(paulThumb);
		calculateBill.setTheCommand(theWaiter);
		calculateBill.returnFinalBill(12.00);

		// Call commands from the BillPayer ArrayList
		CustomerGroup customerGroup = new CustomerGroup();
		customerGroup.add(CustomerTypePicker.getWomanOver60());
		customerGroup.get(0).calculateBill(12.00);
	}
}