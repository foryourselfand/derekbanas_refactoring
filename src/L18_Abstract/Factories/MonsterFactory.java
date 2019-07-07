package L18_Abstract.Factories;
// Here I define the attributes for each monster
// and the methods that will define them

import L18_Abstract.Powers.MonsterAttackPower;
import L18_Abstract.Ranges.MonsterAttackRange;

public interface MonsterFactory {
	MonsterAttackPower assignAttackPower();

	MonsterAttackRange assignAttackRange();
}

