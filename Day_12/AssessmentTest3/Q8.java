package Day_12.AssessmentTest3;

public class Q8 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i = 0; i < 10; i++) {
			if(i % 3 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("Sum = " + sum);
	}

}
