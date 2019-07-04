package L10_Builder;

import L10_Builder.Builders.BLTBuilder;
import L10_Builder.Builders.SandwichBuilder;

class TestDrive {
	public static void main(String[] args) {
		// The director has methods for assigning the
		// Sandwich to build, initializes it and provides
		// the Object to who asks for it

		SandwichArtist paul = new SandwichArtist();

		// Designate the specific Sandwich object we want to build
		SandwichBuilder bltBuilder = new BLTBuilder();

		// Assign the specific Sandwich to build
		paul.setSandwichBuilder(bltBuilder);

		// Initialize everything in the new object
		paul.takeSandwichOrder();

		// Provide the specific Sandwich object
		Sandwich bltSandwich = paul.getSandwich();

		// Print out info on the Sandwich Object
		System.out.println(bltSandwich);

	}

}

