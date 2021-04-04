package day5_unary_assignment_relational_operators;

public class Task18_DecIncPrePos {

	public static void main(String[] args) {


	int x= 2;
	int y= x++;
	y=x;
	System.out.println("\nx = 2 --> and incremented for next line.");
	System.out.println("x= "+ x+"\ny= " + y+ " we gave it same value that x.");

	System.out.println("\n________________________________\n");
	
	int x1= 2;
	int y1= ++x;
	System.out.println("x1 = 3 --> incremented in same line as result of y1");
	System.out.println("x1= "+ x+"\ny1=" + y);

	System.out.println("\n________________________________\n");
	
	int x2= 2;
	System.out.println(x2++);
	System.out.println("\n________________________________\n");
	
	int x3= 2;
	System.out.println(--x3);
	System.out.println("\n________________________________\n");
	
	int x4 = 8;
	int y4= x4--;
	System.out.println("x4= "+ x4 +"\ny4= "+y4);
	System.out.println("\n________________________________\n");
	
	int a=50;
	int result= --a + a++ + a-- + a++;
//	Se trata de una sucesión y por ello el valor cambia de un valor a otro dentro
//	de la misma operación
//				50   + 49 + 50 + 49 + 50 = 197
	System.out.println("a= "+ a +"\nResult= " +result);
	System.out.println("\n________________________________\n");
	
	int h = 1;
	h= -h-- + h++ /-h-- * --h;
//	 -1+0/-1*-1
	System.out.println("h = " + h);
	System.out.println("h= " + h);
	
	System.out.println("\n________________________________\n");
	int x6= 4;
	int y6= x6 * 4 - x6++;
//	operación = 4 * 4= 16 - 4 = 12
	System.out.println("x6= "+ x6);
	System.out.println("y6= "+ y6);
	
	}

}
