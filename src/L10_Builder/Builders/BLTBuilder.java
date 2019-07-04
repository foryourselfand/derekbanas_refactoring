package L10_Builder.Builders;

public class BLTBuilder extends SandwichBuilder {

	// Methods that make this different from other Sandwich Objects

	public void buildBread() {
		sandwich.setBread("White Bread");
	}

	public void buildVegetables() {
		sandwich.setVegetables("Lettuce Tomato");
	}

	public void buildMeat() {
		sandwich.setMeat("Bacon");
	}

	public void buildCheese() {
		sandwich.setCheese("White Bread");
	}

	public void buildCondiments() {
		sandwich.setCondiments("Mayonnaise");
	}
}
