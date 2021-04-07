package Day_12;

public class LabelStatements {

	public static void main(String[] args) {
		
		int i = 0;
		
		outer:
			do {
				i = 8;
		
				if(i <= 10) {
					++i;
					System.out.println(i);
				}
				inner:
					while(true) {
						System.out.println(i--);
											
						if( i==4) {
							System.out.println("break outer loop");
						break outer;
						}
					}
			}while (true); 
		
			System.out.println("hola");
	}		
					
}
	


