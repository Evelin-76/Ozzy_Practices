package Day_12.AssessmentTest3;

public class Q29 {

	public static void main(String[] args) {
		
		int amount = 10;
		
		String result = amount <= 2 ? "couple" : amount < 5 ? "few" : amount <= 5 ? "several" 
				: "many";
		
		System.out.println(result);

	}

}
