package Day_15_method_part3;

public class feetInchesCentimeters {

	public static void main(String[] args) {

		calFeetAndInchesToCentimeters(100);

		calFeetAndInchesToCentimeters(6, 5);

	}

	public static double calFeetAndInchesToCentimeters(double feet, double inches) {

		int cm = 0;
//		feet = 5;
//		inches = 4;

		if (feet < 0 || inches < 0 || inches > 12) {

			return -1;
		}

		double centimeters = (feet * 12) * 2.54;

		System.out.println(feet + " feet " + inches + " inches= " + centimeters + " centimeters.");

		return centimeters;

	}

	public static double calFeetAndInchesToCentimeters(double inches) {

		if (inches >= 0) {

			double feetToInches = (int) inches / 12;
			double remainingInches = inches % 12;

			System.out.println(inches + " inches " + feetToInches + " feet and " + remainingInches + " inches");

			return calFeetAndInchesToCentimeters(feetToInches, remainingInches);

		} else {

			return -1;
		}
	}
}
