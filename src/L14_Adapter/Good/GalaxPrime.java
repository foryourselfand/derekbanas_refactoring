package L14_Adapter.Good;


//This is the adaptee. The Adapter will call the right
//methods here when they are called on the Enemy interface

public class GalaxPrime {

	protected String name = "Galaxian Prime";
	protected int spacesMovedPerTurn = 4;
	private int attackPower = 15;

	public void turnOnForceField() {
		System.out.println(name + " turns on force field");
	}

	public void warpToSpace() {
		System.out.println(name + " warps " + spacesMovedPerTurn + " spaces");
	}

	public void chargePhasers() {
		System.out.println(name + " charges phasers");
	}

	public void firePhasers() {
		System.out.println(name + " fires phasers for " + attackPower + " damage");
	}
}