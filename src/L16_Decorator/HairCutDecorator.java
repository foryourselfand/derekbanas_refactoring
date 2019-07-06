package L16_Decorator;

// The Decorator will allow you to add features
// while keeping them completely separated in
// their own class

public abstract class HairCutDecorator implements HairCut {
	protected HairCut hairCut;

	// The decorator will be able to dynamically customize HairCuts
	HairCutDecorator(HairCut hairCut) {
		this.hairCut = hairCut;
	}

	public String getDescription() {
		return hairCut.getDescription();
	}

	public double getCost() {
		return hairCut.getCost();
	}
}
