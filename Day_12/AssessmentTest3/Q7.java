package Day_12.AssessmentTest3;

public class Q7 {

	public static void main(String[] args) {

		int sum = 0;
		for( int i = 0, j = 0; sum > 20; ++i, --j) {
			
			sum = sum + i + j;
		}
		System.out.println("Sum = " + sum);
	}

}
