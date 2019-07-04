package L7_Strategy.Pays;


public class GetsBonus implements Pay {
	public double getPay(double salary) {
		return salary + (salary * .15);
	}
}
