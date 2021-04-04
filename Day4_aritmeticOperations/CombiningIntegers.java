package Day4_aritmeticOperations;

public class CombiningIntegers {

	public static void main(String[] args) {
		
		//I add this sample as invilid since the sum of 2 short numbers become to int number
		short firstNumber=10;
		short secondNumber=20;
		short thirdNumber;//it must be int instead of short
//			thirdNumber=firstNumber+secondNumber;//error 'cause it overpass the limit range
		
		//Now corret way
		short firstNumber1=10;
		short secondNumber1=20;
		int thirdNumber1;
		thirdNumber1=firstNumber+secondNumber;
		
		System.out.println(thirdNumber1);

	}

}
