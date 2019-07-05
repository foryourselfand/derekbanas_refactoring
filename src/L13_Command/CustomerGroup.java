package L13_Command;

import L13_Command.Bills.BillPayer;

import java.util.ArrayList;

// Group BillPayers into an ArrayList
// Now you can use these BillPayers as simple commands

public class CustomerGroup {

	private ArrayList<BillPayer> customers;

	public CustomerGroup() {
		customers = new ArrayList<>();
	}

	public void add(BillPayer newPayer) {
		customers.add(newPayer);
	}

	public BillPayer get(int customerIndex) {
		return customers.get(customerIndex);
	}
}
