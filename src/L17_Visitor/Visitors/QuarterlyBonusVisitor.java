package L17_Visitor.Visitors;

import L17_Visitor.Visitables.Boss;
import L17_Visitor.Visitables.SalesTrainee;
import L17_Visitor.Visitables.Salesman;

public class QuarterlyBonusVisitor extends Visitor {
	@Override
	public double getYearlyBonusAmount(SalesTrainee trainee) {
		double quarterlyBonusPercentage = (trainee.getSickDays() < 2 && trainee.getFailedTests() < 1) ? .01 : 0;
		return trainee.getSalary() * quarterlyBonusPercentage;
	}

	@Override
	public double getYearlyBonusAmount(Salesman salesman) {
		double quarterlyBonusPercentage = (salesman.getTotalSalesAmount() > 25000 && salesman.getNewCustomers() > 20) ? .03 : 0;
		return salesman.getTotalSalesAmount() * quarterlyBonusPercentage;
	}

	@Override
	public double getYearlyBonusAmount(Boss boss) {
		double quarterlyBonusPercentage = (boss.getOfficeExpenses() < 12000 && boss.getNewCustomers() > 250) ? .05 : .01;
		return boss.getTotalSalesAmount() * quarterlyBonusPercentage;
	}
}
