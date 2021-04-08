package Day_13MethodPart1;

public class hourlyPay {
	
	public static void main(String[] args) {
		
		
		hourlyPay(2,10.5);
		
	}
	public static void hourlyPay(int hours, double pay) {
		
		double sum = hours * pay;
	
		System.out.println("Every hour is payed " + pay);
		System.out.println("Hours worked: " + hours);
		System.out.println("Total payed in a month " + sum);
		
	}

}
