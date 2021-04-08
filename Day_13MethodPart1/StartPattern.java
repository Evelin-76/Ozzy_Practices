package Day_13MethodPart1;

public class StartPattern {

	public static void main(String[] args) {
		
		starPattern(5);

	}

	private static void starPattern(int rows) {
		
		
		for(int row = 1; row <= rows; row++)	{
			for (int stars = 1; stars <= row ; stars++) {
				
				System.out.print("*");	
		}	
		System.out.println();
		}
		
		
		
	}

}
