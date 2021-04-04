package Day4_aritmeticOperations;

public class average {

	public static void main(String[] args) {
		
		long a=2, b=3, c=1, averageL;
		averageL= (a+b+c)/3;
		double d=25, e= 32, f= 7, averageD;
		averageD= (d+e+f)/7;
		
		//better use double instead long since division can result as decimal no
		System.out.println("The average of 1, 2 and 3 is "+ averageL);
		System.out.println("The average of 25, 32 and 7 is "+ averageD);
		int x=160;
		byte y =(byte)x;//example of explicit cast
		System.out.println(x);
		System.out.println(y);
		
		
			
	}

}
