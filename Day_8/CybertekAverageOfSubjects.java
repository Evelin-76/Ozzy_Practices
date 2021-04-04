package Day_8;

public class CybertekAverageOfSubjects {

	public static void main(String[] args) {
		
		int java= 0;
		int softSkills=0;
		int english=0 ;
		double average= (java+softSkills+english)/3;
		if (average>=0 && average<=59) {
			System.out.println("You Failed. \nYou are in F group.");
			if (average == 0) {
				System.out.println("Yoopiii! \nStill donnot pick the phone up for any interview.");
			}
		}else if (average>=60 && average<=69) {
			System.out.println("You Passed. \nYou are in D group.");
		}else if (average>=70 && average<=79) {
			System.out.println(("You Passed. \nWell done! You are in C group."));
		}else if (average>= 80 && average<=89) {
			System.out.println("You Passed. \nGood Job! You are in B group.");
		}else if (average>=90 && average<=100) {
			System.out.println("Congratulation! \nYou are in A group.");
		}else {
			System.out.println("Invalid average");
		}
		System.out.println("Your average is: "+average);
	}

}
