package day5_unary_assignment_relational_operators;

public class UnaryOperators {

	public static void main(String[] args) {
		System.out.println("Samples\n");
		int i1= +10;
		int i2= -100;
		int i3= -(i1+i2);
		System.out.println("i1 = "+ i1);
		System.out.println("i2 = "+ i2);
		System.out.println("j= 5");
		System.out.println("Operation is: -(i1-i2)= -(10-100) and the result will be i3");
		System.out.println("i3 = "+ i3);
		
		System.out.println("\n---------------------------------------------------------------\n");
		
		boolean flag = true;
		System.out.println(!flag);//reverse the value
		System.out.println(!!flag);//double reverse the value
		System.out.println("\n---------------------------------------------------------------\n");
		int i = 10, j= 5;
		i++;
		--j;
		
		System.out.println("\nUsing pre ++i the value of 10 increment in one= " +i);
		System.out.println("Using pre +--j the value of 5 decrement in one= " +j);
		
		int res = i++ + --j;
		System.out.println("\t\nOperation A= "+ res+"\ni++ becomes 11 for next op \n--j becomes 4 for next op\n******Explanation below:");
		System.out.println();
		
		System.out.println("*The result of operation A is i++ + j--=14 "
				+ "since we take 10 first and \nincrease this number in 1 after the operation"
				+ "so it becomes 11. \nSo 10 will be sum to 4 since we took the value of 5 and "
				+ "before the operation \n"
				+ "we decrease it in 1 and we got 4. "
				+ "\nIt means 10+4=14 and the new value of i=11 for next operations.\n");
		
		System.out.println("	--j become 4 ,here the value will be use before execute "
				+ "the operation.");
		System.out.println("	++i becames 11,here the value will be use before execute "
				+ "the operation." );
		System.out.println("	i++ goes on been 10,here the new value will be use after execute"
				+ " the operation and become 11.");
		System.out.println("	j-- goes on been 5,here the new value will be use after execute"
				+ " the operation and become 4.\n");
		
		System.out.println("NOTE: after execute again a new operation using same unary op of\n"
				+ " inc. and dec."
				+ "the value of every variable will change in 1 up to \nthe number of "
				+ "time we will apply them.");
		
		System.out.println("\n---------------------------------------------------------------\n");
//		decreasing
		int g= 10;
		System.out.println("Decreasing:\ng="+ g);
		
		System.out.println(g-- + " -->g++ for first time = same result(it will increase after"
				+ " this line.");
		System.out.println(g-- + " -->g++ for second time g= -1");
		System.out.println(g-- + " -->g++ for third time g= -1-1");
		System.out.println(g + " -->g was decremented one more time after the last statement "
				+ "instrucction g= 1-1-1");
		System.out.println(--g + " -->--g for first time g= -1");
		System.out.println(--g + " -->g-- for second time g= -1-1");
		System.out.println(--g + " -->g++ for third time g= -1-1-1");
		
		
		int e= 1;
		System.out.println("\nIncreasing \ne= 1");
		
		System.out.println(e++ + " -->e++ for first time = same result(it will decrease after"
				+ " this line.");
		System.out.println(e++ + " -->e++ for second time e= +1");
		System.out.println(e++ + " -->e++ for third time e= +1+1");
		System.out.println(e + " -->e was decremented one less time after the last statement "
				+ "instrucction e= 1+1+1");
		System.out.println(++e + " -->++e for first time e= +1");
		System.out.println(++e + " -->e++ for second time e= +1");
		System.out.println(++e + " -->e++ for third time e= ++1 ++>e++ for third time= +1+1");
	}

}
