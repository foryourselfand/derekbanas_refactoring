package L14_Adapter.Good;

public class GoodTestDrive {
	public static void main(String[] args) {
		Enemy galax = new Galax();

		galax.moveShip();
		galax.makeShipAttack();

		System.out.println();


		GalaxPrime galaxPrimeAdaptee = new GalaxPrime();
		Enemy galaxPrime = new EnemyAdapter(galaxPrimeAdaptee);

		galaxPrime.moveShip();
		galaxPrime.makeShipAttack();
	}
}
