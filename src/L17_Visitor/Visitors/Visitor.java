package L17_Visitor.Visitors;

// Each concrete visitor type will implement
// the Visitor interface. Here we define every
// instance of method overloading needed

import L17_Visitor.Visitables.Boss;
import L17_Visitor.Visitables.SalesTrainee;
import L17_Visitor.Visitables.Salesman;

public interface Visitor {
	double visit(SalesTrainee trainee);

	double visit(Salesman salesman);

	double visit(Boss boss);
}
