package Day_8;

public class ifElseIfElse {

	public static void main(String[] args) {
		
		int day=2;
		if (day== 1) {
			System.out.println("Monday");
		}else if (day == 2) {
			System.out.println("Tuesday");
		}else if (day==3) {
			System.out.println("Wednsday");
		}else if (day== 4) {
			System.out.println("Thursday");
		}else if (day==5){
			System.out.println("Friday");
		}else if (day==6) {
			System.out.println("Saturday");
		}else if (day == 7) {
			System.out.println("Sunday");
		}else {
			System.out.println("Your day is not valid.");
		}
		System.out.println("************************************");
		int age= 80;
		if (age<2 || age >18) {
			System.out.println("ineligible");
		}else if (age ==2) {
			System.out.println("Toodler");
		}else if (age>3 && age<=5) {
			System.out.println("Early childhood");
		}else if (age== 6 ||age== 7) {
			System.out.println("Young Reader");
		}else if (age>= 8 && age<=10) {
			System.out.println("Elementary");
		}else if (age== 11 ||age== 12) {
			System.out.println("Middle");
		}else if (age== 13) {
			System.out.println("Imposible");
		}else if (age==14 && age<=16) {
			System.out.println("High School");
		}else if (age==17 ||age ==18) {
			System.out.println("Scholar");
		}else {
			System.out.println("Not applicable");
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
