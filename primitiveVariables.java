package Day3_Variables_dataTypes;

public class primitiveVariables {

	public static void main(String[] args) {
		
		byte b1 = 25;
		byte b2 = - 25;
// wouldn't be not possible because it is out of the limit =127		
//		byte b3 = 128
		
		System.out.println("b1 = " +b1);
		System.out.println("b2 = " + b2);
		
		short s1 = -32768;
		short s2 = 32767;
		short s3 = 500;
		
		System.out.println("s1 = " + s1);
		System.out.println("s2 = " + s2);
		System.out.println("s3 = " + s3);
		
		int i1 = -214768;
		int i2 = 20;
		int i3 = 100_000;
		
		System.out.println("i1 = "+ i1) ;
		System.out.println("i2 = " + i2);
		System.out.println("i3 = " + i3);
		
		long l1 = 500;
		long l2 = -2147483649l;
		
		long creditCardNumber = 5879_1235_3568_5456l;
		
		System.out.println("l1 = " + l1);
		System.out.println("l2 = " + l2);
		System.out.println("Credit Card Number = " + creditCardNumber);
		
//		Now I gonna try bymiself to write Credit Card No with underscores
		
		long creditCardNumber1 = 5879;
		long creditCardNumber2 = 1235;
		long creditCardNumber3 = 3568;
		long creditCardNumber4 = 5456l;
		
		System.out.println("Credit Card Number = " + creditCardNumber1 + "_"
				+ creditCardNumber2 + "_"+ creditCardNumber3 + "_"+ creditCardNumber4);
		
//		floating Numbers: defalt is double so we type end f to difference and use less memory
		
		float f1 = 2.1f;
		double Pi = 3.14;
		System.out.println("f1 = " + f1);
		System.out.println("d1 = " + Pi);
	
//		Now we are working with characters char (single code)
		
		char c1 = 'A';
		 // The number 65 becames HTML number character 'A' as well  since
		//it belong to the number code assign to characer 'A' in the Unicode table
        char c2 = 65;
        //We can also write in the value the unicode assign to character 'A' copying it 
        //from Unicode table
        char c3 = '\u0041';
        
        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        
        //Boolean means values true or false
        
        boolean status = true;
        boolean status2 = false;
        
        System.out.println("Is it true did you pass the exam? " + status);
        System.out.println("It is possible for a person to run at 120 km/hours: " + status2);
        
        //Lest star with String
        String name = "Yo misma";
        System.out.println("Mi nombre es: " + name);
        String age = "muchos";
        System.out.println("Y tengo " + age + " años");
        
//       short way to write variables simplifined :
        
        int price = 5;
        	int quantity = 14;
        		int price2,quantity2;
        			int price3 = 5,quantity3 = 50;
        String name1,address,country,lastname;
        	String objet1,objec2;
        		String positivo="yes",negativo="no";
       
	}
}
