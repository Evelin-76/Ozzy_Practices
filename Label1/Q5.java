package Label1;

public class Q5 {

	public static void main(String[] args) {
		
		caughtSpeeding(86);

	}

	public static void caughtSpeeding(int speed ) {
		
		int noTicket = 0, smallTicket = 1, bigTicket = 2;
				 
		boolean birthday = true;
		
		
		System.out.print("caughtSpeeding(" + speed + ",");
		
		if (speed >= 0 && speed <= 59) {
			
			birthday = !birthday;
			
			System.out.print(birthday + ")-->" + noTicket);
			
		}else if (speed >= 0 && speed <= (60 + 5)) {
			
			System.out.print(birthday + ")-->" + noTicket);
			
		}else if (speed > 60 && speed <= 80) {
			
			birthday = !birthday;
			
			System.out.print(birthday + ")-->" + smallTicket);
			
		}else if (speed > 60 && speed <= 80 + 5) {
			
			System.out.print(birthday + ")-->" + smallTicket);
			
		}else if(speed > 80 ) {
			
			birthday = !birthday;
			
			System.out.print(birthday + ")-->" + bigTicket);
		}else {
			
			System.out.print(birthday + ")-->" + bigTicket);
		}
		
	}
}
