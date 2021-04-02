package Day_10;

public class forEvenNumbers {

	public static void main(String[] args) {
		System.out.print("Even numbers from 1 to 100 are: ");
		for (int even=2 ; even <= 100 ; even +=2) {
			System.out.print(even + ",");
		}
		
		System.out.println();
		
		System.out.print("Odd numbers from 1 to 100 are: ");
		for (int odd = 1 ; odd <=100 ; odd++)
			if (odd%2 == 1) {
				System.out.print(odd +",");
			}
	}

}
