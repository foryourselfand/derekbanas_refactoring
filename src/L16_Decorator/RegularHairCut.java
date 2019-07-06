package L16_Decorator;

// This represents the basic HairCut that was originally
// used all of the time before the upgrade

public class RegularHairCut implements HairCut {
	public String getDescription() {
		return "Trim the Hair";
	}

	public double getCost() {
		return 10.00;
	}
}

