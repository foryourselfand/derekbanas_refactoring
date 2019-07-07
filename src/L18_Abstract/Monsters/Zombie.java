package L18_Abstract.Monsters;

import L18_Abstract.Factories.MonsterFactory;

// A factory is sent into this class that will assign
// the right objects for attack and range to the Zombie

public class Zombie extends Monster {
	// The type of attack & range to assign are past  into the constructor
	private MonsterFactory monsterFactory;

	public Zombie(MonsterFactory monsterFactory) {
		this.monsterFactory = monsterFactory;
	}

	public void makeMonster() {
		System.out.println("Making a Zombie");

		// These are stored in the Monster class
		attackPower = monsterFactory.assignAttackPower();
		attackRange = monsterFactory.assignAttackRange();
	}
}
