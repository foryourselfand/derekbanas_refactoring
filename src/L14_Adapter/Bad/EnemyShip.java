package L14_Adapter.Bad;

public class EnemyShip {
	protected String name;
	protected int spacesMovedPerTurn;
	private int attackPower;

	public EnemyShip(int currentLevel) {
		if (currentLevel <= 5) {

			name = "Galax";
			this.spacesMovedPerTurn = 2;
			this.attackPower = 5;

		} else if (currentLevel < 10) {

			name = "Galaxian";
			this.spacesMovedPerTurn = 3;
			this.attackPower = 10;

		} else if (currentLevel > 10) {

			name = "Galaxian Prime";
			this.spacesMovedPerTurn = 4;
			this.attackPower = 15;

		}
	}

	public void moveShip() {
		System.out.println(name + " moves " + spacesMovedPerTurn + " spaces");
	}

	public void makeShipAttack() {
		System.out.println(name + " does " + attackPower + " damage");
	}
}
