package Day_13MethodPart1;

public class PassMultipleArguments {

	public static void main(String[] args) {

		showSum(5, 10, true);
		showSum(42, 52, false);
		showSum(0, 20, true);
		showSum(3, 0, false);

	}
	public static void showSum(int num1, int num2, boolean num3) {
		
		System.out.println(num1 + num2);
	}
}

