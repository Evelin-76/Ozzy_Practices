package Day_13MethodPart1;

public class accept3Parameters {

	public static void main(String[] args) {
		
		accept3Paramenters(6, 3, " ");


	}
	public static void accept3Paramenters(int num1, int num2, String op) {
		
		 String sum = "\"+\"";	
		 String minus = "\"-\"";	
		 String mult = "\"*\"";	
		 String div = "\"/\"";	
		int result= num1 + num2;
		System.out.println("calculator (" + num1 + "," + num2 + "," + sum +") -->" + result);
		result= num1 - num2;
		System.out.println("calculator (" + num1 + "," + num2 + "," + minus +") -->" + result);
		result= num1 * num2;
		System.out.println("calculator (" + num1 + "," + num2 + "," + mult +") -->" + result);
		result= num1 / num2;
		System.out.println("calculator (" + num1 + "," + num2 + "," + div +") -->" + result);
	}
	

}
