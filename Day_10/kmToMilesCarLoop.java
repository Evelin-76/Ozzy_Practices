package Day_10;

public class kmToMilesCarLoop {

	public static void main(String[] args) {
		
		System.out.println("KPH             MPH");
		System.out.println("__________________________________");
		
		for (double km= 60; km>=60 && km<=130; km +=10) {
			System.out.println(km + "\t\t" + km*0.6214);
		}
		
		System.out.println("**********************");
		//with constants
		final int STARTING_KPH= 60;
		final int MAX_KPH= 130;
		final int INCREMENT= 10;
		
		int kph;
		double mph;
		for (kph=STARTING_KPH; kph<=MAX_KPH; kph += INCREMENT) {
			mph= kph*0.6214;
			System.out.println(kph + "\t\t" + mph );
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
