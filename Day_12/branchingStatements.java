package Day_12;

public class branchingStatements {

	public static void main(String[] args) {
		
		int number = 0;
		
		while(number < 15) {
			
			number++;
			
			if(number <= 5 || number >=11 && number <=13) {
				
				System.out.println("Skipping number " + number);
				
				continue;
			}
			
			System.out.println("number= " + number);
			
			if (number >= 9 || number <=15) {
				
				System.out.println("Not Breaking but Finishing at " + ++number);
	
				//If I use break below it will print until number 7 and go out
				//	but if I don´t break condition it will print untlil condition
				//becomes false so number 15 and following all condition steps
//				break;
				
			
			}
		}

	}

}
