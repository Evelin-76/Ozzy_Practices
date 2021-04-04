package Day4_aritmeticOperations;

public class areaPerimeter {

	public static void main(String[] args) {
		
		double area, perimeter;
		double radius=5.5;
		area=radius*radius*3.14;
		perimeter=2*radius*3.14;
		
		/*A good option I did not use was apply "final" variable for make the value constant 
		 * final double PI=3.14
		 */
		System.out.println(radius+" cm2 is the radius of the circunsference \"a\"");
		System.out.println(perimeter+" cm is the perimeter of the circunsference \"a\"");	

	}

}
