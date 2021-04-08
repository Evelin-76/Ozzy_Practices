package Day14_MethodContinue.Label1;

public class PlayerScore {

	public static void main(String[] args) {
		
		 displayHighScorePosition("Roberto", 5);
		 
		 int score= calculateHighScorePosition(5);
		 
		 System.out.print("Score: " + score);
		

	}
	
	public static void displayHighScorePosition (String name, int position) {
		
		System.out.println(name + " managed to get int position " + position + 
				" on the high score table.");
	}

	public static int calculateHighScorePosition(int playerScore) {
		
		 
		
		if(playerScore >= 1000) {
			
			System.out.print("At high position. ");
				
		}else if(playerScore >= 500 && playerScore < 1000) {
			
			System.out.print("At medium position. ");
			
		}else if(playerScore >= 100 && playerScore < 500) {
			
			System.out.print("At low position. ");
			
		}else {
			
			System.out.print("Eliminated. Your position is ");
			
		}
		
		return playerScore;
		
	}
}
