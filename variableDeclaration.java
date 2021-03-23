package Day3_Variables_dataTypes;

public class variableDeclaration {

	public static void main(String[] args) {
		
//     Differetnts ways to do same thing:
//		1.Long way: First write Declaration 
		byte inches;
		int speed;
		short month;
		float salesCommision;
		double distance;
		
//		later assign 
		inches=5;
		speed=200;
		month=2;
		distance=40.2;
		salesCommision=5;

		//2. Write declare+assign in same line
		byte inches2=5;
		System.out.println(inches);
		System.out.println(speed);
		
//		using concatenation
		int number=20;
		System.out.println("My number is " + number);
	}

}
