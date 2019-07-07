package L18_Abstract.Factories;

import L18_Abstract.Powers.MediumAttack;
import L18_Abstract.Powers.MonsterAttackPower;
import L18_Abstract.Ranges.MediumRange;
import L18_Abstract.Ranges.MonsterAttackRange;

//This defines the attack and range to assign to
//each Vampire created

public class VampireFactory implements MonsterFactory {
	public MonsterAttackPower assignAttackPower() {
		return new MediumAttack();
	}

	public MonsterAttackRange assignAttackRange() {
		return new MediumRange();
	}
}

