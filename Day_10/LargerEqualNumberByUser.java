package Day_10;

import Day_8.LargestNumber;

public class LargerEqualNumberByUser {

	public static void main(String[] args) {
		
				
		int NumberA = 10, NumberB = 5;
		int largerstNumber = 0;

		for (int repeat = 6; repeat > 3; repeat--) {
			System.out.println("Number A= " + NumberA + " Number B= " + NumberB);
			if (NumberA > NumberB) {
				largerstNumber = NumberA;
				System.out.println("The largest number is Number A");
			} else if (NumberA < NumberB) {
				largerstNumber = NumberB;
				System.out.println("The largest number is Number B");
			} else {
				System.out.println("Both numbers are equal");
			}
		}

	}

}
