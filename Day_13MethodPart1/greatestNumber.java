package Day_13MethodPart1;

public class greatestNumber {

	public static void main(String[] args) {
		
		greatestNumber(15, 15, 6);
		
	}
	public static void greatestNumber(int num1, int num2, int num3) {
		
		if(num1 < num2 && num2 < num3) {
			System.out.println("The greatest number is " + num3);
		}else if (num1 > num2 && num1 > num3) {
			System.out.println("The greatest number is " + num1);
		}else {
			System.out.println("The greatest number is " + num2); 
		}
		
		
	}

}
