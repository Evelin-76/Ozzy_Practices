package day5_unary_assignment_relational_operators;

public class mixedInteger {

	public static void main(String[] args) {
		
		int i1= 5;
			int i2= 10;
		float f1= 15.5f;
			double d1= 20.5;
		
		int res1=i1+i2;
		int res2= i1+ (int)f1;//we force f1 to become int number so it won't write decimals
		float res2_2= i1+f1;// it shows decimal because of float type
		double res3= i2+ d1;
		
		System.out.println("A) result 1= "+res1+","+ " result 2= "+ res2 +","+" result 3= "+res3);
		 
		System.out.println();
		
		short firstNumber= 10;
		short secondNumber= 20;

//		 this next wont be possible because short and byte are considered as int so
//		if we sum these two types it will give error since it wont be a int type

//		short thirdNumber= firstNumebr+secondNumber; --righ way to write it is:
		int thirdNumber= firstNumber+secondNumber; //or
		short thirdNumber2= (short)(firstNumber+secondNumber);//by explicit cast
		
		System.out.println("B) -This is the result throught int variable: "+thirdNumber +
				"\n   -And this is the result by explicit cast: "+thirdNumber2);
		
		System.out.println();
		
		byte b1=20;
		byte b2=2;
		
	//	b3= b1*b2;//imposible output.Operators are considered as int 
		int multiplicacion= b1*b2;
		byte multiplicacionExplicit= (byte) (b1*b2);
		System.out.println("Result of a multipliation by int type= "+multiplicacion + 
				"\nResult of same multiplication by explicit cast= "+multiplicacionExplicit);
		
		System.out.println();
		
		int s =126, s2=1;
		
		//byte res= s+s2;//doen't work because we need to cast since we are working with variables
		byte res01= (byte)(s+s2);//we casted variables so it works now
		System.out.println("*Resultado 1 por Explicit Cast=" + res01);
		//another way to do it is using numbers values over variables 
		
		byte res01_1= 126+1;//It goes on inside its limit range so it works as byte type.
		System.out.println("*Result with numbers values(using numbers values as data)= "+ res01_1);
		
		System.out.println();
		int r= 125, r1= 5;
		long res= r+r1;
		System.out.println("Another example of two combined variables of integer type: "+ res);

	

	}

}

