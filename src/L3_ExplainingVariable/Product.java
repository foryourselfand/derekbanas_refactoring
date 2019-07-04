package L3_ExplainingVariable;

public class Product {
	private String name;
	private double price;
	private double shippingCost;
	private int quantity;

	public Product(String name, double price, double shippingCost, int quantity) {
		this.name = name;
		this.price = price;
		this.shippingCost = shippingCost;
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public double getShippingCost() {
		return shippingCost;
	}

	public int getQuantity() {
		return quantity;
	}

	public double getTotalCost() {
		double quantityDiscount = 0.0;

		// If your expressions become complicated it may make more sense to save
		// them in temporary variables (Explaining Variables)

		final boolean over50Products = (quantity > 50) || ((quantity * price) > 500);
		final boolean over25Products = (quantity > 25) || ((quantity * price) > 100);
		final boolean over10Products = (quantity >= 10) || ((quantity * price) > 50);

		if (over50Products)
			quantityDiscount = .10;
		else if (over25Products)
			quantityDiscount = .07;
		else if (over10Products)
			quantityDiscount = .05;

		/* BAD CODE 1
		if((quantity > 50) || ((quantity * price) > 500)) {

			quantityDiscount = .10;

		} else if((quantity > 25) || ((quantity * price) > 100)) {

			quantityDiscount = .07;

		} else if((quantity >= 10) || ((quantity * price) > 50)) {

			quantityDiscount = .05;

		}
		*/

		double discount = ((quantity - 1) * quantityDiscount) * price;

		return (quantity * price) + (quantity * shippingCost) - discount;

	}


}
