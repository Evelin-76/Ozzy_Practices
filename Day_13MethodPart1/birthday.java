package Day_13MethodPart1;

public class birthday {

	public static void main(String[] args) {
		
		int year= 2021;
		int age = 45;
		int birthday = 1976;
		
		agecalculator(year, birthday );
		birthday(year, age);

	}
	public static void birthday(int year, int age) {
		
		System.out.println("Your age in " + year + " is " + age);
		
		for (int i = 0; i <=5; i++) {
			year++;
			age++;
			System.out.println("Your age in " + year + " will be " + age);
		}
		
	}
	public static void agecalculator(int year, int birthdayYear) {
		 
		int currentAge = year - birthdayYear;
		
		System.out.println("Your current age is " + currentAge);
	}

}
