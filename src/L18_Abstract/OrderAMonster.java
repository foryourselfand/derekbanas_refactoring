package L18_Abstract;

import L18_Abstract.Factories.MonsterFactory;
import L18_Abstract.Factories.VampireFactory;
import L18_Abstract.Factories.ZombieFactory;
import L18_Abstract.Monsters.Monster;
import L18_Abstract.Monsters.Vampire;
import L18_Abstract.Monsters.Zombie;

public class OrderAMonster extends MonsterBuilder {

	protected Monster makeMonster(String typeOfMonster) {
		Monster theMonster = null;

		if (typeOfMonster.equals("Zombie")) {
			// Create the factory that assigns the right attributes
			// to each Zombie

			MonsterFactory monsterFactory = new ZombieFactory();

			// Create a Zombie Monster that stores the Objects
			// specific for each zombie so they can be assigned
			// to this monster

			theMonster = new Zombie(monsterFactory);

			theMonster.setName("Zombie Bob");

		} else if (typeOfMonster.equals("Vampire")) {
			// Create the factory that assigns the right attributes
			// to each Vampire

			MonsterFactory monsterFactory = new VampireFactory();

			// Create a Vampire Monster that stores the Objects
			// specific for each Vampire so they can be assigned
			// to this monster

			theMonster = new Vampire(monsterFactory);

			theMonster.setName("Vampire Paul");
		}

		return theMonster;
	}
}
