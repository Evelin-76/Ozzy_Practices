package Day4_aritmeticOperations;

public class contribution {

	public static void main(String[] args) {
/*
 * This program calculates the amount of pay that will be contributed to 
 * a retirement plan if 5%, 8% or 10% of monthly pay is withheld(retenido).
 */
		double monthlyPay5Withheld=0.05;
		double monthlyPay10Withheld=0.1;
		double monthlyPay8Withheld=0.08;
		double retirementPlan=2500;
		
		
		double retirementPlanTotal5;
		double retirementPlanTotal8;
		double retirementPlanTotal10;
		
		retirementPlanTotal5=retirementPlan*monthlyPay5Withheld;
		retirementPlanTotal8=retirementPlan*monthlyPay8Withheld;
		retirementPlanTotal10=retirementPlan*monthlyPay10Withheld;
		
		System.out.println("The percentage whithheld for 5% contribution is: $" +retirementPlanTotal5+" per month.");
		System.out.println("The percentage whithheld for 8% contibution is: $" +retirementPlanTotal8+" per month.");
		System.out.println("The percentage whithheld for 10% contribution is: $" +retirementPlanTotal10+ " per month.");
		
	}

}
