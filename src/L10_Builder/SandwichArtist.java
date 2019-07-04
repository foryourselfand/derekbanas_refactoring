package L10_Builder;

import L10_Builder.Builders.SandwichBuilder;

// The Director which assigns the type of Sandwich to build
// and then calls all of the initialization methods

class SandwichArtist {
	private SandwichBuilder sandwichBuilder;

	public void setSandwichBuilder(SandwichBuilder sandwichBuilder){
		this.sandwichBuilder = sandwichBuilder;
	}

	public Sandwich getSandwich(){ return sandwichBuilder.getSandwich(); }

	// Initializes the Sandwich object
	public void takeSandwichOrder(){
		sandwichBuilder.makeSandwich();
		sandwichBuilder.buildBread();
		sandwichBuilder.buildVegetables();
		sandwichBuilder.buildMeat();
		sandwichBuilder.buildCheese();
		sandwichBuilder.buildCondiments();
	}

}