package day7_controlFlowStatements;

public class GreetHours {

	public static void main(String[] args) {
		int hour=5;
				
				
		if (hour>=6 && hour<12) {
			System.out.println("Good morning!");
		}
		
		if (hour>= 12 && hour< 15) {
			System.out.println("Good afternoon!");
		}
		
		if (hour>= 15 && hour<= 22){
			System.out.println("Good evening!");
		}
		if (hour> 22 ){
			System.out.println("Good night!");
		}else  {
			System.out.println("Good night!");
		
		
		}

	}

}
