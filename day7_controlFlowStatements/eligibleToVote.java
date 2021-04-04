package day7_controlFlowStatements;

public class eligibleToVote {

	public static void main(String[] args) {
		
		int age= 10;
		if (age>=18) {
			System.out.println("You are eligible to vote");
		}
		else System.out.println("You are not eligible to vote.\nTry after you will be "
				+ "more than 18 years old");	

	}

}
