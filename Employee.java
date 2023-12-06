package unocareer;

public class Employee {
	  double basicSalary;
	   double sales;
	    double incentives;
	
	
	public double getIncentives () {
		incentives =sales *(25/100.0);
		return incentives;
	}
	public double getTotalSalary() {
		return basicSalary + incentives;
	}

}
	


