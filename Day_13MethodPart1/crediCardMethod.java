package Day_13MethodPart1;

public class crediCardMethod {

	public static void main(String[] args) {
		
		double salary = 50000;
		int creditRating = 5;
		
		if(salary >= 20000 && creditRating >= 7) {
			
			qualify();
			
		}else {
			noQuality();
		}

	}

	private static void noQuality() {
		
		System.out.println("I am sorry, you are not qualified for the CC");
	}

	private static void qualify() {
		
		System.out.println("Congratulation, you are qualified for the CC");
	}
	
	
	
	

}
