package L13_Command.Bills;

public class ManOver60 implements BillPayer {
	public void calculateBill(double amountDue) {
		System.out.println("Bill Amount for Man Over 60: $" + (amountDue - (amountDue * .05)));
	}
}
