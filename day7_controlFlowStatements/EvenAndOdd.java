package day7_controlFlowStatements;

public class EvenAndOdd {

	public static void main(String[] args) {
		int even=2, a=2, b=4, c=6;
		int odd=7, d=3, e=5, f=7;
		
		if (even==a || even==b || even==c) {
			System.out.println(even+" is an odd number");
		}
		if (odd==d || odd==e || odd==f) {
			System.out.println(odd+" is an even number");
		}
		int evenOrOdd= 5;
		
		if (evenOrOdd%2==0) {
			System.out.println(evenOrOdd+"is an even number.");
			
		}else {
			System.out.println(evenOrOdd+" is an odd number");
		}

	}

}
