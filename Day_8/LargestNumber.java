package Day_8;

public class LargestNumber {

	public static void main(String[] args) {
	int a= 5;
	int b= 8;
	int c= 2;
	if (a==b && a==c && c==b) {
		System.out.println("All numbers have same value");
	}else if(a==b || a==c) {
		System.out.print("The equals numbers are ");
		if (a==b) {
			System.out.println("a and b");
		}else  {
			System.out.println("a and c");
		}		
	}else if (b==c) {
		System.out.println("The equals numbers are b and c");	
	}else if (b>a && b>c) {
		System.out.println("The greatest number is b");
	}else if (c>a && c>b) {
		System.out.println("The greatest number is c");
	}else if(a>b && a>c) {
		System.out.println("The greatest number is a");
	}else {
		System.out.println("Your number is not valid");
	}
		System.out.println("a="+a+", b="+b+", c="+c);
	}
}


