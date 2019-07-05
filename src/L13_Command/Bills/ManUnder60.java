package L13_Command.Bills;

public class ManUnder60 implements BillPayer {
	public void calculateBill(double amountDue) {
		System.out.println("Bill Amount for Man Under 60: $" + amountDue);
	}
}
