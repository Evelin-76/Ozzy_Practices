package Day_8;

public class Calculator {

	public static void main(String[] args) {
		
		int num1= 5, num2= 2, result=0;
		
		String calculator= "per cent";
		
		switch (calculator) {
		
			case "sum":
				System.out.println("You use +");
				System.out.println("You will add numbers");
				result= num1+num2;
				System.out.println(num1+"+"+num2+"="+result);
				break;
			case "minus":
				System.out.println("You use -");
				System.out.println("You will subtrat numbers");
				result= num1-num2;
				System.out.println(num1+"-"+num2+"="+result);
				break;
			case "division":
				System.out.println("You use /");
				System.out.println("You will divide numbers");
				result= num1/num2;
				System.out.println(num1+"/"+num2+"="+result);
				break;
			case "multiplication":
				System.out.println("You use *");
				System.out.println("You will multiply numbers");
				result= num1*num2;
				System.out.println(num1+"*"+num2+"="+result);
				break;
			case "reminder":
				System.out.println("You use %");
				System.out.println("You will get the remind value");
				result= num1%num2;
				System.out.println(num1+"%"+num2+"="+result);
				break;
			default:
				System.out.println("Your operation is not valid");
		}
	}
}
