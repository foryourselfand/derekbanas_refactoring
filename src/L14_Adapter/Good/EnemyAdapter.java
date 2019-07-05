package L14_Adapter.Good;

// The adapter can provide completely different
// actions for the methods implemented

// The adapter contains an object of the same
// type as adaptee, so all calls sent to
// the Enemy are sent to methods of the adaptee

public class EnemyAdapter implements Enemy {
	private GalaxPrime galaxPrime;

	public EnemyAdapter(GalaxPrime galaxPrime) {
		this.galaxPrime = galaxPrime;
	}

	public void moveShip() {
		galaxPrime.turnOnForceField();
		galaxPrime.warpToSpace();
	}

	public void makeShipAttack() {
		galaxPrime.chargePhasers();
		galaxPrime.firePhasers();
	}
}
