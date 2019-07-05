package L11_12_CompositeBuilderTree_Accumulation;

public class TestDrive {

	public static void main(String[] args){

		// Create an Item that stores all others, or the Root
		ItemBuilder products = new ItemBuilder("Products");
		products.addChild("Produce");
		products.addChild("Orange");
		products.addItemInformation("Price", "$1.00");
		products.addItemInformation("In Stock", "100");
		products.addSibling("Apple");
		products.addSibling("Grapes");

		// Change the current Item to the Root of the tree
		products.editThisItem("Products");
		products.addChild("Cereal");
		products.addChild("Special K");
		products.addItemInformation("Price", "$3.68");
		products.addSibling("Raisin Bran");
		products.addItemInformation("Price", "$3.78");

		products.editThisItem("Apple");
		products.addItemInformation("Price", "$.25");
		products.addSibling("Peach");

		products.editThisItem("Cereal");
		products.addChild("Fiber One");
		products.addItemInformation("Price", "$4.00");

		products.displayAllItems();

		// Print information on just the Cereal Item and its children
		System.out.println("\n" + products.getItemByName("Cereal"));

	}
}
