package L16_Decorator;

// When new features are needed it is a bad idea to
// add new code to older classes. This would make
// compact easy to understand classes complicated
// because they would break the Single responsibility
// principle.

// The decorator pattern instead places each special
// case behavior (Embellishment) into its own class.

// By using the decorator pattern we'll also satisfy
// another SOLID principle being the Interface segregation
// principle, by using many specific interfaces rather
// than one general purpose interface.

class TestDrive {
	public static void main(String[] args) {
		HairCut permAndCut = new Perm(new RegularHairCut());

		System.out.println("Services");
		System.out.println(permAndCut.getDescription());
		System.out.println("Price: $" + permAndCut.getCost());
	}
}
