package day7_controlFlowStatements;

public class theGreatestOne {

	public static void main(String[] args) {
		
		int first= 5;
		int second= 2;
		int third= 100;
				if (!(first>second && first<third && second<third && third>first) ) {
					System.out.println("The smaller number is: " + third);
				}
				else {
					System.out.println("The greatest number is:"+ second);
				}
		System.out.println("*************************************************");
		
		int a=0;
		int b=6;
		int c=6;
		
		System.out.println("a="+a+", b="+b+", c="+c);
		
		
			if (a>b && a>c) {
				System.out.println("The greater number is a");
				}else if (b>a && b>c) {
					System.out.println("The greater number is b");
				}
				else if (c>b &&c>a) {
					System.out.println("The greater number is c");
				}
						
			if ((a==b) && (a==c) && (c==b)){
				System.out.println("All numbers keeps same value.");
				}else if ((a==b) && (a>c)) {
				System.out.println("The greater numbers are a and b since both contain same value.");
			}else if ((a==c) && a>b) {
				System.out.println("The greater numbers are a and c since both contain same value.");
			}else if ((b==c) && (b>a)) {
				System.out.println("The greater numbers are b and c since both contain same value.");
			}
		}
}	
