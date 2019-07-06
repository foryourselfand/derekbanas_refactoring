package L17_Visitor.Visitors;

import L17_Visitor.Visitables.Boss;
import L17_Visitor.Visitables.SalesTrainee;
import L17_Visitor.Visitables.Salesman;

public class YearlyBonusVisitor extends Visitor {
	@Override
	public double getYearlyBonusAmount(SalesTrainee trainee) {
		double yearlyBonusPercentage = (trainee.getSickDays() < 10 && trainee.getFailedTests() < 2) ? .10 : .02;
		return trainee.getSalary() * yearlyBonusPercentage;
	}

	@Override
	public double getYearlyBonusAmount(Salesman salesman) {
		double yearlyBonusPercentage = (salesman.getTotalSalesAmount() > 100000 && salesman.getNewCustomers() > 50) ? .12 : .04;
		return salesman.getTotalSalesAmount() * yearlyBonusPercentage;
	}

	@Override
	public double getYearlyBonusAmount(Boss boss) {
		double yearlyBonusPercentage = (boss.getOfficeExpenses() < 50000 && boss.getNewCustomers() > 1000) ? .15 : .04;
		return boss.getTotalSalesAmount() * yearlyBonusPercentage;
	}
}
