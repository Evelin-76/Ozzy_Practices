package day6_locicalOps;

public class locicalOps {

	public static void main(String[] args) {
	
		char c1= 'A';
		char c2= 65;
		int i1 = 5;
		int i2 = 10;
		
		boolean res1= (i1==i2)&&(c1==c2);//It checks both operations--> F & F= false
		System.out.println("Result 1 with Logic AND (&&) is equal to: "+ res1);
		boolean res2= (i1==i2)&(c1==c2);//It checks just first operation because
		// the first result is false so && does not care about the second one--> F &&= false
		System.out.println("Result 2 with bitwise AND operator (&) is equal to: "+ res2);
		
		boolean res3= (c1==c2) | (i1==i2);//It checks both operations--> T | F = true
		System.out.println("Result 3 with bitwise OR opeartor (|) is equal to: "+ res3);
		boolean res4= (c1==c2) || (i1==i2);//It checks first operation because the first 
		//operation is true it jumps the second one--> T || = true
		System.out.println("Result 4 with Logic OR operator (||) is equal to: "+res4);
		
		boolean res5= (c1==c2) ^ (i1==i2);//IT checks both ops --> T ^ F = true
		System.out.println("The result 5 with XOR operator (^) is equal to: "+ res5);
		boolean res6 = (c1==c2) ^(i1!=i2); //It checks both ops --> T ^ T = false
		System.out.println("the result 5 with XOR opeartor (^) using NOT "
				+ "operator as well (!)  is equal to: "+res6);
		
		
	}

}
