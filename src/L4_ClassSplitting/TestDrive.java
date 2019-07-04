package L4_ClassSplitting;

public class TestDrive {
	public static void main(String[] args) {
		Customer sallySmith = new Customer("Sally", "Smith", "123 Main St", "Perry", "Iowa", 50220);

		// The positive of accessing fields through accessor methods is that
		// subclasses can override the way fields are accessed and the fields
		// can be protected. The negative is that the code is hard to read
		System.out.println("Customer Name: " + sallySmith.getFirstName() + " " + sallySmith.getLastName());
		System.out.println("Address: " + sallySmith.getAddress().getStreet() + " " + sallySmith.getAddress().getCity() +
				" " + sallySmith.getAddress().getState() + " " + sallySmith.getAddress().getPostalCode());

		Address markJonesAddress = new Address("123 Main St", "Perry", "Iowa", 50220);
		Birthday markJonesBirthday = new Birthday(12, 21, 1974);
		Customer markJones = new Customer("Mark", "Jones", markJonesAddress, markJonesBirthday);

		// I can call for the birthday directly because I have toString() in Birthday
		System.out.println(markJones.getBirthDay());

		// Versus this, or the call to accessor methods

		// I can do the same with Address
		System.out.println(markJones.getAddress());
	}
}
