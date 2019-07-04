package L7_Strategy.Emlpoyees;


import L7_Strategy.Pays.Pay;

public class Secretary extends Employee {
	public Secretary(double salary) {
		super(salary);
	}

	public Secretary(double salary, Pay payType) {
		super(salary);
		setPayType(payType);
	}
}