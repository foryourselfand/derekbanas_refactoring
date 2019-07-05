package L13_Command.Bills;

public class WomanOver60 implements BillPayer {
	public void calculateBill(double amountDue) {
		System.out.println("Bill Amount for Woman Over 60: $" + (amountDue - (amountDue * .10)));
	}
}
