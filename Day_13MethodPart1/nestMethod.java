package Day_13MethodPart1;

public class nestMethod {

	public static void main(String[] args) {

		System.out.println("I am starting in main method");
		deep();
		System.out.println("Again I am back in main method");

	}
	public static void deep() {
		
		System.out.println("I am now in deep method");
		deeper();
		System.out.println("I am back in deep method again");
	}
	private static void deeper() {
		
		System.out.println("I am now in deeper method wich it is inside deep method");
		
	}
}
