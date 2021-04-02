package Day_10;

public class evenAndOddAdition {

	public static void main(String[] args) {
			
//		int aditionEven = 0;
//		int aditionOdd = 0;
//		
//		
//		System.out.println("Odd numbers is: ");
//		
//		for (int odd = 1 ; odd < 100 ; odd += 2) {
//
//			aditionOdd = aditionOdd + odd;
//		}
//		for (int even = 2 ; even <= 100 ; even += 2) {
//			
//			aditionEven = aditionEven + even;
//		}
//		int total = aditionEven + aditionOdd;
//		
//		
//		System.out.println("Even numbers sum = "+aditionEven);
//		System.out.println("Odd numbers sum = "+ aditionOdd);
//		System.out.println("Here are the adition of even and odd numbers from 0 to 99: " + total);	
		
		System.out.println("***********************************");
		
		int sumOdd=0, sumEven=0;
		 
		for (int i = 0 ; i < 100 ; i++) {
			if (i %2 == 1) {
				sumOdd = sumOdd + i;
			}else {
				sumEven = sumEven + i;
			}
			System.out.println("Even numbers sum = " + sumEven);
			System.out.println("Odd numbers sum = " + sumOdd);
			
			int total = sumEven + sumOdd;
			
			System.out.println("The total sum even and odd numbers is equal to " + total);
		}
	}

}
