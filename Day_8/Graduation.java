package Day_8;

public class Graduation {

	public static void main(String[] args) {
		
		int mark=725;
		
		if (mark<60) {
			System.out.println("Fail");
		}else if (mark>=60 && mark<=90 ) {
			System.out.println("Pass");
		}else if (mark>=90 && mark<=100) {
			System.out.println("Passed with distinction");
		}else {
			System.out.println("Invalid score");
		}

	}

}
