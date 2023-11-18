package uno.career;

public class SalarylnHand {

	public static void main(String[] args) {
		 int monthly_salary = 60000;
		 int tax_save_inve = 50000; 
		 int annual_income = monthly_salary*12;
		 int taxable_income=0;
//		 taxaable_income-------------------------------
		 if (tax_save_inve>100000) {
			 taxable_income = annual_income-100000;
		 }else {
			 taxable_income = annual_income-tax_save_inve;
		 }
		//		 tax_calculation
		 int tax1=0;
		 int tax2=0;
		 int tax3=0;
		 int tax4=0;
		 if (taxable_income <= 250000) {
			 tax1=0;
		 }else if(taxable_income < 500000) {
			 tax1=0;
			 tax2=(int) ((taxable_income-250000)*0.05);
		 }else if(taxable_income < 1000000) {
			 tax1=0;
			 tax2=(int) (250000*0.05);
			 tax3=(int) ((annual_income-500000)*0.20);
		 }else if(taxable_income>1000000) {
			 tax1=0;
			 tax2=(int) (250000*0.05);
			 tax3=(int) ((annual_income-500000)*0.20);
			 tax4=(int) ((annual_income-1000000)*0.30);
		 }	 
		 int total_tax= tax1+tax2+tax3+tax4;  
//		 income after Tax
		 int income_after_tax = annual_income-total_tax;	 
//		 in_hand salary	 
		 int in_hand = income_after_tax/12;
		 System.out.println(annual_income);
		 System.out.println(taxable_income);
		 System.out.println(total_tax);
		 System.out.println(in_hand); 
	}

}
