package Day_13MethodPart1;

public class MilesToKms {

	public static void main(String[] args) {
		
		convertKms();
		converMiles();

	}
	public static void convertKms() {
		
		
		final double KMTOMILEOP= 0.621371;
		double km=1;
		double kmToMile= km * KMTOMILEOP;

		
		System.out.println(km + " kilometers = " + kmToMile + " miles.");
		
	}
	public static void converMiles() {
		
		final double MILETOKMOP= 1.60934;
		double mile=1;
		double mileToKm= mile * MILETOKMOP;
		
		System.out.println(mile + " miles = " + mileToKm + " kilometers.");
	}

}
