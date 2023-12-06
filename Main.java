package unocareer;

public class Main {

	public static void main(String[] args) {
		
		Employee emp1 =new Employee();
		emp1.basicSalary=10000;
		emp1.sales =50000;
		System.out.println(emp1.getIncentives());
		System.out.println(emp1.getTotalSalary());
	}

}
