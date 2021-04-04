package day7_controlFlowStatements;

public class smallTasks {

	public static void main(String[] args) {
		
		int x=5, y=20;
		if (y==20) {
			x=5;
		}
		System.out.println("x= "+ x+ " y= " + y);
		
		System.out.println("******************************************");
		
		int hours = 50;
		double payRate= 10;
		double commisionPayRate= 1.5;
		if (hours>40) {
			System.out.println(payRate*commisionPayRate);
		}
		System.out.println("******************************************");
		boolean max= true;
		int fees= 20;
		if (max) {
			fees=50;
			System.out.println(fees);
		}
		System.out.println("******************************************");
		int b= 50, c= 150, a=20;
		if (b==50 && c>100) {
			System.out.println(a);
		}
		System.out.println("******************************************");
		int temp =75;
		if (temp >=70 && temp<=80) {
			System.out.println("Ideal Temp");
		}
		System.out.println("Not Ideal Temp");
	}

}
