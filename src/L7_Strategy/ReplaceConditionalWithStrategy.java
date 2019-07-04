package L7_Strategy;

import L7_Strategy.Emlpoyees.Employee;
import L7_Strategy.Emlpoyees.Salesman;
import L7_Strategy.Emlpoyees.Secretary;
import L7_Strategy.Pays.GetsBonus;
import L7_Strategy.Pays.NoBonus;

// Conditional logic is often used to decide which algorithm to use.

// The strategy design pattern is used to dynamically
// change the algorithm used by an object at run time
// which makes it great for eliminating conditionals

// You create subclasses for each algorithm and then
// the right algorithm is used at run time. This is
// another example of how you can replace conditionals
// with Polymorphism

public class ReplaceConditionalWithStrategy {
	public static void main(String[] args) {
		Employee salesman = new Salesman(15000.00);
		Employee secretary = new Secretary(25000.00);

		System.out.println("Salesman Pay: $" + salesman.getPay());
		System.out.println("Secretary Pay: $" + secretary.getPay());

		// You can add a bonus to a salesman's salary at run time
		salesman.setPayType(new GetsBonus());
		System.out.println("Salesman's New Pay: $" + salesman.getPay());

		// You could also set set Bonus type in the constructor
		Employee salesTrainee = new Salesman(15000.00, new NoBonus());
		System.out.println("Sales Trainee Pay: $" + salesTrainee.getPay());

		secretary.setPayType(new GetsBonus());
		System.out.println("Secretary Pay: $" + secretary.getPay());

	}


}