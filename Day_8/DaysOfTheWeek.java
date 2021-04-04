package Day_8;

public class DaysOfTheWeek {

	public static void main(String[] args) {
		
		System.out.println("What date is today?");
		
		String day= "Saturday";
		
		switch (day) {
		case "Monday":
			System.out.println("Today is Monday");
			break;
		case "Tuesday":
			System.out.println("Today is Tuesday");
			break;
		case "Wednesday":
			System.out.println("Today is Wednesday");
			break;
		case "Thursday":
			System.out.println("Today is Thursday");
			break;
		case "Friday":
			System.out.println("Today is Friday");
			break;
		case "saturday":
			System.out.println("Today is Saturday");
			break;
		case "Sunday":
			System.out.println("Today is Sunday");
			break;
//		default :
//			System.out.println("It is not a day name");
		}
		System.out.println("Have a great "+ day+ "!");
	}

}
