package L4_ClassSplitting;

// Demonstrate how to extract a class, and move methods and fields
// Classes with too many responsibilities must me split
// 1. Look for a set of data that goes together
// 2. Create a new class with a name that describes that data
// 3. Move all the fields and methods
// 4. Decide how to provide access to the new class

public class Customer {
	private String firstName;
	private String lastName;

	private Address address;

	private Birthday birthDay;

	public Customer(String firstName, String lastName, String street, String city, String state, int postalCode) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = new Address(street, city, state, postalCode);
	}

	public Customer(String firstName, String lastName, Address address, Birthday birthDay) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.birthDay = birthDay;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Address getAddress() {
		return address;
	}

	public Birthday getBirthDay() {
		return birthDay;
	}
}