package Day_12.AssessmentTest3;

public class Q6 {

	public static void main(String[] args) {
		
		int k= 0;
		int m = 0;
		
		for( int i = 0; i <= 3; i++) {
			
			k++;
			if(i == 2) {
				i = 4;
			}
			m++;
		}
		System.out.println(k + "," + m);
	}

}
