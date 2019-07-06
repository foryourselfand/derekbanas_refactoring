package L17_Visitor.Visitors;

// Each concrete visitor type will implement
// the Visitor interface. Here we define every
// instance of method overloading needed

import L17_Visitor.Visitables.Boss;
import L17_Visitor.Visitables.SalesTrainee;
import L17_Visitor.Visitables.Salesman;

public abstract class Visitor {
	public double visit(SalesTrainee trainee) {
		System.out.println("Trainees Yearly Bonus");
		return getYearlyBonusAmount(trainee);
	}

	public double visit(Salesman salesman) {
		System.out.println("Salesmans Yearly Bonus");
		return getYearlyBonusAmount(salesman);
	}

	public double visit(Boss boss) {
		System.out.println("Bosses Yearly Bonus");
		return getYearlyBonusAmount(boss);
	}

	public abstract double getYearlyBonusAmount(SalesTrainee trainee);

	public abstract double getYearlyBonusAmount(Salesman salesman);

	public abstract double getYearlyBonusAmount(Boss boss);
}
