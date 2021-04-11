package Day_15_method_part3;

public class Retirement {

	public static void main(String[] args) {

		yearUntilFetirement("Evelin", 1976);
		
		
	}
	
	public static int calculateAge (int currentYear, int birthYears) {
		 
		return currentYear - birthYears;
		
	}

	private static void yearUntilFetirement(String name, int year) {
		
		
		int currentAge = calculateAge(2021, 1976);
		int retirementAge = 65 - currentAge;
				
		System.out.println(name + " is " + currentAge + " years old.");
		System.out.println("She retires in " + retirementAge + " years");
					 
		
	}
	
	

}
