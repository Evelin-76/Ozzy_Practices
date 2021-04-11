package Day_15_method_part3;

public class assignment1_SwapValue {

	public static void main(String[] args) {

		// SwapValue Solution-1 by using 3rd variable
		int n1 = 10;
		int n2 = 20;
		int n3;

		n3 = n1;
		n2 = n3;
		n1 = n2;

		System.out.println("n1= " + n1);
		System.out.println("n2= " + n2);

		// Solution-2 without using 3rd variable

		int num1 = 10;
		int num2 = 20;

//		num1 = num1 + num2;
//		num2 = num1 - num2;
//		num1 = num1 - num2;

		num2 = num2 - num1;
		num1 = num1 + num2;

		System.out.println("num1= " + num1);
		System.out.println("num2= " + num2);

	}

}
