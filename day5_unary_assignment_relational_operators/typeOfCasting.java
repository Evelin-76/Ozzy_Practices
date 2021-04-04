package day5_unary_assignment_relational_operators;

public class typeOfCasting {

	public static void main(String[] args) {
		
		byte b;
		int i= 81;
		double d= 323.142;
		float f=72.38f;
		char c='A';
//		remember char means single character represented by different numbers so
//		'A' = 65, when we change its value to 81 it becomes to 81='Q' 
		c=(char)i;
		System.out.println("i = " +i + " c= " + c);
		
		i= (int) d;
		System.out.println("d= " +d + " i= " + i);
		
		i= (int)f;
		System.out.println("f= " +f + " i= " + i);
		
		b= (byte)d;
		System.out.println("d= " +d + " b= " + b);
		

	}

}
