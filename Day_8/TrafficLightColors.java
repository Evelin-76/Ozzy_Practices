package Day_8;

public class TrafficLightColors {

	public static void main(String[] args) {
		
		String color= "o";
		
		switch (color) {
		case "R":
			System.out.println("Red");
			color= "red";
		break;
		
		case "r":
			System.out.println("Red");
			color= "red";
		break;
		
		case "O":
			System.out.println("Orange");
			color= "orange";
		break;
		
		case "o":
			System.out.println("Orange");
			color= "orange";
		break;
		
		case "G":
			System.out.println("Green");
			color= "green";
		break;	
		
		case "g":
			System.out.println("Green");
			color= "green";
		break;
		}
		System.out.println("The light traffic is "+color);
		 
		}
	}


