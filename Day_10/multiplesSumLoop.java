package Day_10;

public class multiplesSumLoop {

	public static void main(String[] args) {

		int number = 9;
		int multiple1 = 3;
		int multiple2 = 5;
		int sumOfMultiples1 = 0;
		int sumOfMultiples2 = 0;
		int totalsum;

		System.out.print("The multiples of " + multiple1 + " are: ");
		for (number = 1; number < 10; number++) {
			if (number % multiple1 == 0) {
				System.out.print(number + ",");
			}
		}

		System.out.println();
		for (number = 1; number < 10; number++) {
			if (number % multiple1 == 0) {
				sumOfMultiples1 = number + number;
			}
		}

		System.out.print("The sum of all multiples of 3 below to 10 is " + sumOfMultiples1);

		System.out.println();

		System.out.print("The multiples of " + multiple2 + " is: ");
		for (number = 1; number < 10; number++) {
			if (number % multiple2 == 0 && number < 10) {
				System.out.print(number);
				sumOfMultiples2 = number;
			}
		}
		System.out.println();

		totalsum = sumOfMultiples1 + sumOfMultiples2;

		System.out.println("The sum of the all multiples of 3 and 5 below 10 is equal to " + totalsum);

	}
}