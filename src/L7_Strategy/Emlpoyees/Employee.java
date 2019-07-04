package L7_Strategy.Emlpoyees;

import L7_Strategy.Pays.NoBonus;
import L7_Strategy.Pays.Pay;

public class Employee {
	public Pay payType = new NoBonus();

	// We use an instance of the Pay interface
	// Employee doesn't care what Pay does
	// This allows the capabilities of objects to change
	// at run time
	protected double salary;

	Employee(double salary) {
		this.salary = salary;
	}

	Employee(double salary, Pay payType) {
		this.salary = salary;
		this.payType = payType;
	}

	public void setPayType(Pay payType) {
		this.payType = payType;
	}

	public double getPay() {
		return payType.getPay(this.salary);
	}
}