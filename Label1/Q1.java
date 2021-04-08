package Label1;

public class Q1 {
	
	public static void main(String[] args) {

		strinRepitation("Hi", 1);

	}

	public static void strinRepitation(String Hi, int times) {

		int stringTimes = 0;

		System.out.print("stringTimes(\"Hi\"," + times + "); => ");
		
		for (stringTimes = 1; stringTimes <= times; stringTimes++) {
			System.out.print(Hi);
		}

	}
}


