package L14_Adapter.Good;

// This is the interface the client works with
// The adapter makes sure new classes are
// compatible with it

interface Enemy {
	void moveShip();

	void makeShipAttack();
}
