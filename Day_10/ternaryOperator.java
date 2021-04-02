package Day_10;

	public class ternaryOperator {
		
	public static void main(String [] args) {
		
		String detailedResult;
		int score=0;
		
		//Two ways to do it. This one is through ternary operator, nested one condition inside another:
		
		detailedResult = score > 0 && score < 50 ? "Fail"
				: score >= 50 && score <= 100 ? "Pass"
						: score > 100 ? "N/A"
								: "Inanamiyorum How is " + "possible to take such a score? You have got " + score;

		System.out.println(detailedResult);
		
		//This is other way to do it with selection statements:
		
//						if (score> 0 && score < 50) {
//							System.out.println("Fail");
//							}else if (score >= 50 && score <= 100) {
//								System.out.println("Pass");
//							}else if (score >= 100) {
//								System.out.println("N/A");
//							}else {
//								System.out.println("Inanamiyorum, How is possible to take"
//										+ "such a score. You have got" + score);
//							}
						

}
}