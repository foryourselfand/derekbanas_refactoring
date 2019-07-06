package L16_Decorator;
// With the decorator we can easily add additional
// features and calculations without changing
// the code that already exists

public class Perm extends HairCutDecorator {
	Perm(HairCut hairCut) {
		super(hairCut);
	}

	public String getDescription() {
		return hairCut.getDescription() + "\nAdd Chemicals and Put Hair in Rollers";
	}

	public double getCost() {
		return hairCut.getCost() + 75.00;
	}
}