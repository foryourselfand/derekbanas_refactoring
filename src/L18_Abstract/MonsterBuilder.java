package L18_Abstract;

import L18_Abstract.Monsters.Monster;

// Now that I have Monsters defined, their individual attacks
// & ranges and I have a factory for making them I have to
// create a way to order them.

public abstract class MonsterBuilder {

	protected abstract Monster makeMonster(String typeOfMonster);

	public Monster orderAMonster(String typeOfMonster) {
		Monster theMonster = makeMonster(typeOfMonster);

		// Test out the methods for the Monster
		theMonster.makeMonster();
		theMonster.checkIfVictimIsInRange();
		theMonster.attackTheVictim();

		return theMonster;
	}
}
