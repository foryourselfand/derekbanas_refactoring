package L7_Strategy.Pays;


public class NoBonus implements Pay {
	public double getPay(double salary) {
		return salary;
	}
}
