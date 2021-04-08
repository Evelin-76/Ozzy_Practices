package Day_13MethodPart1;

public class LoopCallMethod {

	public static void main(String[] args) {
		
		int i;
		System.out.println("Hello form the main method");
		for(i = 0; i <= 5; i++) {
			displayMessage();
			System.out.println("Back in the main method");
		}
		System.out.println("The messages were repeted for: " + i + " times each.");
	}
	public static void displayMessage() {
		
		System.out.println("Hello from displayMessage method");
	}

}
