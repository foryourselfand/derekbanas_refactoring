package L15_PrimitiveToClass.Bad;

public class TestDrive {
	public static void main(String[] args) {
		ATMAccess user = new ATMAccess();
		System.out.println(user.getState());

		user.verifyCard(123456789);
		System.out.println(user.getState());

		user.verifyPIN(1234);
		System.out.println(user.getState());

		user.verifyWithdrawalAmount(99);
		System.out.println(user.getState());
	}
}
