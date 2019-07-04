package L7_Strategy.Pays;

public class Bonus20Per implements Pay {
	public double getPay(double salary) {
		return salary + (salary * .20);
	}
}
