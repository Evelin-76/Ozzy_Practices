package Day_15_method_part3;

public class MethodOverloading {

	public static void main(String[] args) {


		System.out.println(sum(1, 0));
		System.out.println(sum(2, 2, 0, ""));
		System.out.println(sum(5, 5, 5, 0, "Me"));

	}

	public static int sum (int a, int b) {
		
		return a + b;
		
	}
	public static String sum (int a, int b, int c, String you) {
		
		you = "You";
		
		return you;
		
	}
	public static float sum (int a, int b, int c, int d, String me) {
		
		return a + b + c + d;
		
	}
}
