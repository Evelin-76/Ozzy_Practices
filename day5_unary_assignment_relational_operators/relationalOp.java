package day5_unary_assignment_relational_operators;

public class relationalOp {

	public static void main(String[] args) {
		System.out.println("Values:");
		int a=5;
		int b= 6;
		
		boolean verdadero= a<b;
		boolean verdadero1= a!=b;
		boolean falso= a<=b;
		boolean falso1= a==b;
		boolean falso2= a>=b;
		
		System.out.println("a= "+a+"\n"+ "b= "+b);
		System.out.println("	\"b\" is greater than \"a\".\n\n"
				+ "-Another comparisions are:\n ");
		
		
		System.out.println("a<b = " + verdadero + "\n" +
							"a!=b = " + verdadero1 + "\n" +
							"a<=b = " + falso + "\n" +
							"a==b = " + falso1 + "\n" +
							"a>=b = " + falso2 + "\n");

	}

}
