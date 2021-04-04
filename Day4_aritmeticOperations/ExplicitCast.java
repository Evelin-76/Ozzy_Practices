package Day4_aritmeticOperations;

public class ExplicitCast {

	public static void main(String[] args) {
		
		//Several ways to do it:
		// a) we do not force double in result
		
		int pies=10, people=4;
		double piesPerson;
		piesPerson=pies/people;
		
		System.out.println("a)"+piesPerson);
		
		// b) we force double in result using Explicit Cast only to assign "pies"
		
				int pies1=10, people1=4;
				double piesPerson1;
				piesPerson1=(double)pies1/people1;
				
				System.out.println("b)"+piesPerson1);
				
		// c) we force double in result using Explicit Cast only to assign "people"
				
				int pies2=10, people2=4;
				double piesPerson2;
				piesPerson2=pies2/(double)people2;
				
				System.out.println("c)"+piesPerson2);
				
		// d) we force double in result using Explicit Cast assign to both pies&people
				
				int pies3=10, people3=4;
				double piesPerson3;
				piesPerson3=(double)(pies3/people3);
				
				System.out.println("d)"+piesPerson3);

				
				
	}

}
