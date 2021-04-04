package Day_8;

public class nestedGreatestNumber {

	public static void main(String[] args) {
	
//		This practice does not comptemplate the equals value between numbers
// 		For cover all possible cases go to LargestNumber class		
		int a=50;
		int b=500;
		int c=60;
		
		if (a>b && a>c) {
			System.out.println("a is the greatest number");
		}
			else {
				if (b>a && b>c) {
					System.out.println("b is the greatest number");
				}
					else {
						System.out.println("c is the greater number");
				}
			}
		
		System.out.println("a= "+a +",b= "+b +",c= "+c);
	}
}
		
		
		



