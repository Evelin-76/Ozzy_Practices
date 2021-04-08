package Day_13MethodPart1;

public class PassArg {

	public static void main(String[] args) {
		
		int x = 10;
		
		displayValue(5);
		displayValue(x);
		displayValue(2);
		displayValue(x + 1);

	}
	public static void displayValue(int num) {
		
		System.out.println("The value is " + num);
	}

}
