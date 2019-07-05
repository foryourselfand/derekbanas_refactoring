package L11_12_CompositeBuilderTree_Accumulation;

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


//	public String toString() {
//		StringBuffer itemInfo = new StringBuffer();
//
//		itemInfo.append("\n").append(itemName).append(" ");
//		if (! itemInfoHM.isEmpty())
//			itemInformation.append(displayProductInfo());
//
//		for (Item node : children)
//			itemInformation.append(node.toString());
//
//		return itemInformation.toString();
//	}

	// This is an accumulation method which accumulates information
	// into itemInformation. I want to split this big method into
	// many smaller methods. The String data type won't allow me to
	// accumulate information across methods though so I'll use a
	// StringBuffer instead.
	public String toString() {
		StringBuffer itemInfo = new StringBuffer();

		addItemInfoAndChildren(itemInfo);

		return itemInfo.toString();
	}

	private void addItemInfoAndChildren(StringBuffer itemInfo) {
		addItemInformation(itemInfo);
		addChildrenInformation(itemInfo);
	}

	private void addItemInformation(StringBuffer itemInfo) {
		itemInfo.append("\n").append(itemName).append(" ");

		if (! itemInfoHM.isEmpty()) {
			itemInfo.append(displayProductInfo());
		}
	}

	private void addChildrenInformation(StringBuffer itemInfo) {
		for (Item node : children)
			itemInfo.append(node.toString());
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

