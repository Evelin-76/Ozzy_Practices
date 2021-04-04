package day7_controlFlowStatements;

public class RevenueAndDiscount {

	public static void main(String[] args) {
		
		double price= 565;
		int quantity= 25;
		double revenue=price*quantity; 
		double totalRevenue;
		double discount= 0;
		if (revenue>5000) {
			discount= 0.1;
			totalRevenue = revenue-(revenue*discount);
			System.out.println("You have a discount of: "+discount + "€");
			System.out.println("Your revenue is: "+totalRevenue+"€");
		}
		else {
			System.out.println("Your revenue is: "+ revenue+"€");
			System.out.println("Your dicount is: "+discount+"€");
		}
	}

}
