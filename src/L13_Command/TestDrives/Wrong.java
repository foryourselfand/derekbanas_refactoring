package L13_Command.TestDrives;

import L13_Command.WrongCustomer;

public class Wrong {
	public static void main(String[] args) {
		WrongCustomer billSmith = new WrongCustomer(62, true, 12);
		billSmith.returnFinalBill();
	}
}
