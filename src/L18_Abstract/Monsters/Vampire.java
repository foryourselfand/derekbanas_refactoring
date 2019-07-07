package L18_Abstract.Monsters;

import L18_Abstract.Factories.MonsterFactory;

public class Vampire extends Monster {
	// The type of attack & range to assign are past
	// into the constructor
	private MonsterFactory monsterFactory;

	public Vampire(MonsterFactory monsterFactory) {
		this.monsterFactory = monsterFactory;
	}

	public void makeMonster() {
		System.out.println("Making a Vampire");

		// These are stored in the Monster class
		attackPower = monsterFactory.assignAttackPower();
		attackRange = monsterFactory.assignAttackRange();
	}
}
