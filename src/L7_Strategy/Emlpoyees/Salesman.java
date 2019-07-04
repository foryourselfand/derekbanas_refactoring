package L7_Strategy.Emlpoyees;


import L7_Strategy.Pays.Pay;

public class Salesman extends Employee {
	public Salesman(double salary) {
		super(salary);
	}

	public Salesman(double salary, Pay payType) {
		super(salary);
		setPayType(payType);
	}
}