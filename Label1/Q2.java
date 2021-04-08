package Label1;

public class Q2 {

	public static void main(String[] args) {

		greatNumber6(2, 4);

	}

	public static void greatNumber6(int num1, int num2) {

		System.out.print("love6(" + num1 + "," + num2 + ")-->");
		boolean love6 = true;
		int sum = num1 + num2;
		int minus = num1 - num2;

		if (sum == 6 || minus == 6 || num1 == 6 || num2 == 6) {

			System.out.println(love6);
		} else {
			System.out.println(!love6);
		}

	}
}
