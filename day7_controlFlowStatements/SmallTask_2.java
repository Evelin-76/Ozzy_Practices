package day7_controlFlowStatements;

public class SmallTask_2 {

	public static void main(String[] args) {
		int y=0, x=100;
		if (x>100) {
			y=20;
			
		}
		else {
			y=0;
		}
		System.out.println("x="+x+"\ny="+y);
		
		System.out.println("****************************");
		
		int x1= 0, y1=100;
		if (y1 == 100) {
			x1=1;
		}
		else {
			x1=0;
		}
		System.out.println("x="+x1+"\ny="+y1);
				
		System.out.println("****************************");
		
		int b, c=11;
		if (c<10) {
			b=0;
			c=1;
		}
		else {
			b=-99;
			c=0;
		}
		System.out.println("b="+b+"\nc="+c);
	}
	

}
