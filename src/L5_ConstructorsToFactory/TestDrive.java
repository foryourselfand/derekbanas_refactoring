package L5_ConstructorsToFactory;

public class TestDrive {
	public static void main(String[] args) {

		// This factory will generate specific subclasses of Customers
		CustomerFactory customerFactory = new CustomerFactory();

		// This assigns the methods and fields for the class Premier

		// This is replaced when I get rid of the Switch
		// Customer3 goodCustomer = customerFactory.getCustomer(Customer3.PREMIER);

		AbstractCustomer goodCustomer = customerFactory.getCustomer("Premier");
		System.out.println(goodCustomer);

		// This assigns the methods and fields for the class Deadbeat

		// This is replaced when I get rid of the Switch
		// Customer3 badCustomer = customerFactory.getCustomer(Customer3.DEADBEAT);

		AbstractCustomer badCustomer = customerFactory.getCustomer("Deadbeat");
		System.out.println(badCustomer);
	}
}
