package L2_MethodExtraction;

public class TestDrive {
	public static void main(String[] args) {
		FootballPlayer40YardDashInfo fb40Dash = new FootballPlayer40YardDashInfo();

		// Add Clark Kent for example
		double cKent40YdDashTimes[] = {4.36, 4.39, 4.41};
		FootballPlayer clarkKent = new FootballPlayer("Clark Kent", cKent40YdDashTimes);
		fb40Dash.addFootballPlayer(clarkKent);

		// Add Bruce Wayne for example
		double bWayne40YdDashTimes[] = {4.42, 4.43, 4.49};
		FootballPlayer bruceWayne = new FootballPlayer("Bruce Wayne", bWayne40YdDashTimes);
		fb40Dash.addFootballPlayer(bruceWayne);

		fb40Dash.printPlayerInfo();
	}
}
