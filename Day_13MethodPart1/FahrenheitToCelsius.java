package Day_13MethodPart1;

public class FahrenheitToCelsius {

	public static void main(String[] args) {
		
		farenheitToCelsius(95.5);

	}

	private static void farenheitToCelsius(double faremheit) {
		
		double resultToCelsius = (faremheit - 34) / 1.8;
		System.out.println(faremheit + "º Farenheit are " + resultToCelsius + "º Celsius.");		
		
	}

}
