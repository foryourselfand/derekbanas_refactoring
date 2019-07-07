package L18_Abstract.Monsters;

// This class defines attributes and capabilities
// for each monster

import L18_Abstract.Powers.MonsterAttackPower;
import L18_Abstract.Ranges.MonsterAttackRange;

public abstract class Monster {
	protected MonsterAttackPower attackPower;
	protected MonsterAttackRange attackRange;
	private String name;

	public abstract void makeMonster();

	public void checkIfVictimIsInRange() {
		System.out.println(getName() + " hecks if victim is " + attackRange);
	}

	public void attackTheVictim() {
		System.out.println(getName() + " attacks the victim for " + attackPower);
	}

	public String toString() {
		return getName() + " attacks anything " + attackRange + " for " + attackPower;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
