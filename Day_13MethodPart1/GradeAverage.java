package Day_13MethodPart1;



public class GradeAverage {

	public static void main(String[] args) {

		averageSumaverageSum(100, 5, 98);

	}

	private static void averageSumaverageSum(int average1, int average2, int average3) {

		
		int averageSum= (average1 + average2 + average3) / 3 ;
		
		System.out.print(average1 + ", " +  average2 + ", " +average3 + " = "+ averageSum + "--> ");
		
		if (averageSum > 89 && averageSum < 101) {
			System.out.println( "Grade A");
		} else if (averageSum > 79) {
			System.out.println("Grade B");
		} else if (averageSum > 69) {
			System.out.println("Grade C");
		}else if (averageSum > 59) {
			System.out.println("Grade D");
		} else if (averageSum >= 0 && averageSum < 60) {
			System.out.println("Grade F");
		} else {
			System.out.println("Invalid data");
		}
	}

}
