package L1_Constructors;
// Demonstrate chain constructors
// Code Refactoring

public class FootballPlayer2 {
	private String playerName;
	private String college;
	private double fortyYardDash;
	private int repsBenchPress;
	private double sixtyYardDash;

	/*
	// Too much duplication in constructors
	public FootballPlayer2(String playerName, String college,
			double fortyYardDash, double sixtyYardDash){
		this.playerName = playerName;
		this.college = college;
		this.fortyYardDash = fortyYardDash;
		this.sixtyYardDash = sixtyYardDash;
	}

	public FootballPlayer2(String playerName, String college,
			double fortyYardDash, int repsBenchPress){
		this.playerName = playerName;
		this.college = college;
		this.fortyYardDash = fortyYardDash;
		this.repsBenchPress = repsBenchPress;
	}

	public FootballPlayer2(String playerName, String college,
			double fortyYardDash, int repsBenchPress, double sixtyYardDash){
		this.playerName = playerName;
		this.college = college;
		this.fortyYardDash = fortyYardDash;
		this.repsBenchPress = repsBenchPress;
		this.sixtyYardDash = sixtyYardDash;
	}
	*/

	// Create a general catch all constructor
	public FootballPlayer2(String playerName, String college, double fortyYardDash, int repsBenchPress, double sixtyYardDash) {
		this.playerName = playerName;
		this.college = college;
		this.fortyYardDash = fortyYardDash;
		this.repsBenchPress = repsBenchPress;
		this.sixtyYardDash = sixtyYardDash;
	}

	public FootballPlayer2(String playerName, String college, double fortyYardDash, int repsBenchPress) {
		this(playerName, college, fortyYardDash, repsBenchPress, 0.0);
	}

	public FootballPlayer2(String playerName, String college, double fortyYardDash, double sixtyYardDash) {
		this(playerName, college, fortyYardDash, 0, sixtyYardDash);
	}

	public String getPlayerName() {
		return playerName;
	}

	public String getCollege() {
		return college;
	}

	public double get40YdDash() {
		return fortyYardDash;
	}

	public int getRepsBenchPress() {
		return repsBenchPress;
	}

	public double get60YdDash() {
		return sixtyYardDash;
	}

}
