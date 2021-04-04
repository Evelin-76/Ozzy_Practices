package Day4_aritmeticOperations;

public class discoutn {

	public static void main(String[] args) {
	
		/*
		 * This program calculates the sale price of an
		 * item that is regular prices at $59, with a 20% discount on it
		 */
		
		int regularPrice=59;
		double discount;
		double salesPrice;
		
		discount = regularPrice*0.2;//we use 0.2 instead 20%(unreconigze)
		salesPrice=regularPrice-discount;
		
		System.out.println("Regular Prices: $ " + regularPrice);
		System.out.println("Discoutn Amount: $ "+ discount);
		System.out.println("Sales Price: $ "+salesPrice);
		
	}

}
