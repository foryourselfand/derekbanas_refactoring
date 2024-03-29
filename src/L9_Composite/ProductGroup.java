package L9_Composite;

import java.util.ArrayList;

public class ProductGroup extends ProductComponent {

	// Each group and all the products contained in that group are stored in this ArrayList
	private ArrayList<ProductComponent> productComponents = new ArrayList<>();

	private String productGroupName;

	public ProductGroup(String productGroupName) {
		this.productGroupName = productGroupName;
	}

	public void add(ProductComponent newProductComponent) {
		productComponents.add(newProductComponent);
	}

	public void remove(ProductComponent newProductComponent) {
		productComponents.remove(newProductComponent);
	}

	public ProductComponent getProductComponent(int componentIndex) {
		return productComponents.get(componentIndex);
	}

	public String getProductGroupName() {
		return productGroupName;
	}

	public void displayProductInfo() {

		System.out.println(getProductGroupName());

		// Cycle through and print every product in this Product Group

		for (ProductComponent productInfo : productComponents)
			productInfo.displayProductInfo();

//		Iterator<ProductComponent> productIterator = productComponents.iterator();
//
//		while (productIterator.hasNext()) {
//			ProductComponent productInfo = productIterator.next();
//			productInfo.displayProductInfo();
//		}

		System.out.println();
	}
}
