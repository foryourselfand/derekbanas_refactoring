package L5_ConstructorsToFactory;
// Replace constructors with factories

public abstract class AbstractCustomer {
	static final int PREMIER = 2;
	static final int VALUED = 1;
	static final int DEADBEAT = 0;

	private String customerRating;

	public String getCustomerRating() {
		return customerRating;
	}

	public void setCustomerRating(String customerRating) {
		this.customerRating = customerRating;
	}

	public String toString() {
		return "This Customers Rating: " + getCustomerRating();
	}
}

