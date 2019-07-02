package L1_Constructors;

public class TestDrive {
	public static void main(String[] args) {
		// The creation methods
		// Explain what type of player is being made
		// Are easier to understand (especially the attributes)

		FootballPlayer aaronRodgers = FootballPlayer.createQB(108.0, 259);
		FootballPlayer calvinJohnson = FootballPlayer.createWR(11, 1964);
		FootballPlayer sebastianJanikowski = FootballPlayer.createKicker(31, 33.0);

		System.out.println("Aaron Rodgers Passer Rating: " + aaronRodgers.getPasserRating());

	}
}
