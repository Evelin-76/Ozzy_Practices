package Day_13MethodPart1;

public class GoogleSearch {

	public static void main(String[] args) {
	
		for(int i= 0; i < 100; i++) {
			navigateGoogle();
			searchForShoes();
			printResults();
		}
		

	}
	public static void navigateGoogle() {
		System.out.println("Launch Chrome Browser");
		System.out.println("Navigate to google.com");
	}
	public static void searchForShoes () {
	
		System.out.println("Type shoes int search field");
		System.out.println("Click on search button");
	}
	public static void printResults() {
		
		System.out.println("Result for shoes...");
	}
}
