package L5_ConstructorsToFactory;

class CustomerFactory {
	// This is a poor design because this switch needs updated
	// every time I make a new subclass
	public AbstractCustomer getCustomer(int customerType) {
		switch (customerType) {
			case 2:
				return new Premier();
			case 0:
				return new Deadbeat();
			default:
				throw new IllegalArgumentException("Invalid Customer Type");
		}
	}


	public AbstractCustomer getCustomer(String customerName) {
		try {
			// forName returns a class object with the String that is
			// passed to it. newInstance() creates an instance of the class
			return (AbstractCustomer) Class.forName(customerName).newInstance();
		} catch (Exception e) {
			throw new IllegalArgumentException("Invalid Customer Type");
		}
	}
}