package L13_Command;

import L13_Command.Bills.BillPayer;
import L13_Command.Bills.ManOver60;
import L13_Command.Bills.ManUnder60;
import L13_Command.Bills.WomanOver60;

// Returns the right BillPayer object based on the method called
// If I want to add another BillPayer I just update this and
// create a new BillPayer class (That's It)

public class CustomerTypePicker {
	public static BillPayer getWomanOver60() {
		return new WomanOver60();
	}

	public static BillPayer getManOver60() {
		return new ManOver60();
	}

	public static BillPayer getManUnder60() {
		return new ManUnder60();
	}
}
