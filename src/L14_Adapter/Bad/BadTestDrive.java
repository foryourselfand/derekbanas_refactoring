package L14_Adapter.Bad;

// In this example code as new enemy ships were needed
// conditionals were added and then subclasses when
// the original code didn't work.

// With the adapter pattern we can create a new class
// without disturbing any other code. On top of that
// adapters make it easier to swap in code at runtime.
// They also allow you to communicate with code using
// method names that make sense to you.

public class BadTestDrive {
	public static void main(String[] args) {
		EnemyShip level1Ship = new EnemyShip(6);

		level1Ship.moveShip();
		level1Ship.makeShipAttack();

		GalaxianPrime primeTime = new GalaxianPrime(15);

		primeTime.moveShip();
		primeTime.makeShipAttack();
	}
}
