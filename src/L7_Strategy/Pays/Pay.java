package L7_Strategy.Pays;

// By implementing Pay classes can easily change
// pay amount without effecting the program

// Adding new pay structures has little effect

public interface Pay {
	double getPay(double salary);
}
