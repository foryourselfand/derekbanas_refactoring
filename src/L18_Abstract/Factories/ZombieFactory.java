package L18_Abstract.Factories;

import L18_Abstract.Powers.BasicAttack;
import L18_Abstract.Powers.MonsterAttackPower;
import L18_Abstract.Ranges.BasicRange;
import L18_Abstract.Ranges.MonsterAttackRange;

// This defines the attack and range to assign to
// each Zombie created

public class ZombieFactory implements MonsterFactory {
	public MonsterAttackPower assignAttackPower() {
		return new BasicAttack();
	}

	public MonsterAttackRange assignAttackRange() {
		return new BasicRange();
	}
}
