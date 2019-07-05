package L14_Adapter.Good;

class Galax implements Enemy {
	private int spacesMovedPerTurn = 2;
	private int attackPower = 5;

	public void moveShip() {
		System.out.println("Galax moves " + spacesMovedPerTurn + " spaces");
	}

	public void makeShipAttack() {
		System.out.println("Galax does " + attackPower + " damage");
	}
}
