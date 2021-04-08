package Day_13MethodPart1;

public class greaterNumber {

	public static void main(String[] args) {
		
		greaterNumber();

	}

	private static void greaterNumber() {
		
		int a = 10, b = 10;
		
		if(a > b) {
			System.out.println(a + " is greater than " + b);
		}else if (b > a) {
			System.out.println(b + " is greater than " + a);
		}else {
			System.out.println(a + " is equal to " + b);
		}
		
	}

}
