package L11_CompositeBuilderTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Item {
	private String itemName;

	// Will store children of this Item in a tree
	private ArrayList<Item> children;

	// I'm using a HashMap to store key value pairs
	private HashMap<String, String> itemInfoHM;

	public Item(String itemName) {
		this.itemName = itemName;

		children = new ArrayList<>();
		itemInfoHM = new HashMap<>();
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	// Used to add children nodes
	public void add(Item childNode) {
		children.add(childNode);
	}

	public void addItemInformation(String infoName, String info) {
		itemInfoHM.put(infoName, info);
	}

	public String getItemInformation(String infoName) {
		return itemInfoHM.get(infoName);
	}

	public String toString() {
		StringBuilder itemInformation = new StringBuilder("\n" + itemName + " ");

		// If Item info is available get it
		if (! itemInfoHM.isEmpty())
			itemInformation.append(displayProductInfo());


		// Attach all children for this Item
		for (Item node : children)
			itemInformation.append(node.toString());

		return itemInformation.toString();
	}

	public String displayProductInfo() {
		StringBuilder productInfo = new StringBuilder();

		// Cycle through every key, value pair and return them
		// entrySet() returns a Set that contains the Map entries

		for (Map.Entry<String, String> entry : itemInfoHM.entrySet())
			productInfo.append(entry.getKey()).append(": ").append(entry.getValue()).append(" ");

		return productInfo.toString();
	}
}

