package Day_8;

public class SwitchCases {

	public static void main(String[] args) {
		
		String weather= "raining";
		
		switch (weather) {
		
			case "sunny":
				System.out.println("Go to the park and");
				System.out.println("Code Java");
				break;
			case "hot":
				System.out.println("Go to swimming and");
				System.out.println("Code Java");
				break;
			case "windy":
				System.out.println("Fly a kite and");
				System.out.println("Code Java");
				break;
			case "snowy":
				System.out.println("Make a Snowman and");
				System.out.println("Code Java");
				break;
			default:
				System.out.println("Do what you want but  \ndon't forget to code Java");
		}	
				

	}

}
