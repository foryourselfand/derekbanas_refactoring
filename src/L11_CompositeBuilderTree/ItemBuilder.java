package L11_CompositeBuilderTree;

import java.util.ArrayList;

public class ItemBuilder {

	// Holds all of the Items created
	private ArrayList<Item> items = new ArrayList<>();

	// Stores the root and parent Item objects for the
	// current Item you are working with so you can
	// add siblings and children based on location in
	// the tree structure

	private Item root;
	private Item current;
	private Item parent;

	public ItemBuilder(String rootName) {

		root = new Item(rootName);

		addItemToArrayList(root);

		current = root;
		parent = root;

		// Store the parent for the Item object
		root.addItemInformation("Parent", parent.getItemName());
	}

	// Allows me to store Item information
	public void addItemInformation(String name, String value) {
		current.addItemInformation(name, value);
	}

	// Adds a Child Item to the current parent Item
	public void addChild(String child) {
		Item childNode = new Item(child);

		addItemToArrayList(childNode);

		current.add(childNode);
		parent = current;
		current = childNode;

		// Store the parent for the Item object
		childNode.addItemInformation("Parent", parent.getItemName());
	}

	// Adds a sibling Item to the current Item stored in current
	public void addSibling(String sibling) {
		Item siblingNode = new Item(sibling);

		addItemToArrayList(siblingNode);

		// Adding a child node to the parent Item

		parent.add(siblingNode);
		current = siblingNode;

		// Store the parent for the Item object
		siblingNode.addItemInformation("Parent", parent.getItemName());

	}

	// Adds Item objects to ArrayList
	public void addItemToArrayList(Item newItem) {
		items.add(newItem);
	}

	public String toString() {
		return root.toString();
	}

	public void displayAllItems() {
		for (Item item : items)
			System.out.println(item.getItemName() + ": " + item.displayProductInfo());
	}

	// Changes the Current Item object that is being used
	public void editThisItem(String itemName) {
		for (Item item : items) {
			if (item.getItemName().equals(itemName)) {
				current = item;

				// Gets the name of the stored parent object
				// and passes it so that parent can be set
				// as the parent in the ItemBuilder
				setItemsParent(current.getItemInformation("Parent"));
			}
		}
	}

	// Sets the Parent Item for ItemBuilder
	public void setItemsParent(String parentItem) {
		for (Item item : items) {
			if (item.getItemName().equals(parentItem)) {
				parent = item;
			}
		}
	}

	// Returns the Item based on the name passed into the method
	public Item getItemByName(String itemToGet) {
		Item itemToReturn = null;

		for (Item item : items) {
			if (item.getItemName().equals(itemToGet)) {
				itemToReturn = item;
			}
		}

		return itemToReturn;
	}
}

