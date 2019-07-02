package L2_MethodExtraction;

public class FootballPlayer {
	private String name;
	private double[] fortyYearDashTime = null;

	public FootballPlayer(String name, double[] fortyYearDashTime) {
		this.name = name;
		this.fortyYearDashTime = fortyYearDashTime;
	}

	public String getName() {
		return name;
	}

	public double[] getFortyYearDashTime() {
		return fortyYearDashTime;
	}
}
