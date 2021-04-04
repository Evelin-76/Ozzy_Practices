package day6_locicalOps;

public class precedenceOp {

	public static void main(String[] args) {
		
		int applesCount = 20;
		int orangesCount = 30;
		int pearsCount =30;
		boolean comp = applesCount < orangesCount || orangesCount>= pearsCount;
//		result will be true since both comparations are true.To make sure it is true both 
//		operations are checked since the first one is true.
		System.out.println("A)With OR logic operator, greater than and less than, result is: " +comp);
		
		System.out.println();
		
		String outSideWeather;
		int degree;
		outSideWeather = "Shinny";
		degree= 70;
		
		System.out.println();
		
		int b = 2;
		boolean res= ++b == 2 || --b == 2 && --b == 2;
//		               3 == 2 ||   2 == 2 &&   1 == 2;
//					      F   ||      T   &&     F
//		 				  F   ||           F
//		                     end result is false
		System.out.println("B) The result in order of precedence is: " + res);
		
		System.out.println();
		
		boolean comp2 = (!(outSideWeather ==  "Rainy" || degree == 70));
		
		System.out.println("C)First comparation is false but second one is true so \nit gives a result of "
				+ "true but as we use \n! Logic operator envolving comparition it"
				+ " will chane the result to: "+comp2);
		
		System.out.println();
		
		boolean x = true, z = true;
		int y = 20;
		x = (y !=10) || (z= false);
//		       True  || --> no need to check because first comparation is true
//		        so it says x = true (same as the first value assing to x)
				
		System.out.println("A) X result 1: "+x);
		
		System.out.println();
		

		boolean x1 = true, z1 = true;
		int y1 = 20;
		x1 = (y1 !=10) && (z1= false);
//		       True  ||    False  = false 
//		        result x change to false because x at the beginning is true instead of false
		
		System.out.println("B) X result 1: "+x1);
		
		System.out.println();
		

		boolean x2 = false, z2 = true;
		int y2 = 20;
		x2 = (y2 !=10) || (z2= false);
//		       True  ||  --> no need to go on wiht 2nd op.
//		        result x change to true this time because we assined a new value with the opeartion
//				that converted it in true instead of false
			
		System.out.println("C) X result 1: "+x2);
		
		System.out.println();
		
		double d= 20;
		double e= 80;
		double op= d+e*25;
		double rem= op%40;
		System.out.println("D) Result is: "+rem);
		boolean remTotal= rem<= (double)20;
		System.out.println("Reminder of the operation is equal to 20 or less than 20: "+ remTotal);
		
		System.out.println();
		
		double d1= 20;
		double e1= 80;
		double op1= d+e*25;
		double rem1= op1%40;
		System.out.println("E) Result is: "+rem1);
		boolean remTotal1= rem1==20 || rem1<20;
		System.out.println("The result of the operation is equal to 20 so it is: "+ remTotal1);
		
		
		
		
		
		
		
		
	}

}
