package Day_10;

public class forOddNumbersSelected {

	public static void main(String[] args) {
		
		System.out.print("Odds numbers between 5 and 140 are: ");
		
		for (int odd = 5 ; odd <= 140 ; odd++) {
			if (odd%2 == 1) {
				System.out.print(odd+ ",");
			}
		}

	}

}
