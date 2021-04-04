package day7_controlFlowStatements;

public class TriangleAngles {

	public static void main(String[] args) {
	int angle1=55;
	int angle2= 40;
	int angle3= 85;
	int triangle= angle1+angle2+angle3;
	
	if (triangle == 180) {
		
		System.out.println("These angles are valid for a Triangle:");
		
	}
	else {
		System.out.println("These angles are not valid for a triangle");
	}
	System.out.println("angle a= "+ angle1 +", angle b= "+angle2+", angle c="+angle3
			+"\na+b+c="+triangle );
	
	}

}
