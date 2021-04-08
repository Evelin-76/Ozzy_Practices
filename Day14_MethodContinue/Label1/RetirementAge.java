package Day14_MethodContinue.Label1;

public class RetirementAge {

	public static void main(String[] args) {
		
		int currenAge = calculateAge(2021, 1976);
		
		
		
		int leftYEars = retirementYears("", currenAge);
		
		System.out.print(" is " + currenAge + ". ");
		
		System.out.print("She will retire with " + leftYEars + " years old. ");
		
		int totalUntilRetirement = leftYEars - currenAge;
				
				System.out.print("Still left " + totalUntilRetirement + " years.");

	}

	public static int calculateAge(int currentYear, int yearBirth){
		
		int age = currentYear - yearBirth;
		
		return age;
	}
	public static int retirementYears (String name, int retirementAge) {
		
		name = "Evelin";
		retirementAge = 65;
		
		System.out.print(name);
		
		return retirementAge;
		
	}
}
