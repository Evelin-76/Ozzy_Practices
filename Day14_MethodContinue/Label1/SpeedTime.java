package Day14_MethodContinue.Label1;

public class SpeedTime {

	public static void main(String[] args) {

		double distance= vehicleSpeed(5,3);

		System.out.println("You runned " + distance +"km/h.");
		
		if(distance >500) {
			
			System.out.println("You could go to your city from Madrid");
		}else {
			
			System.out.println("You could not go to your city from Madrid");
		}
	}
	
	public static double vehicleSpeed (double km, double hour) {
		
		double kmHours = km * hour;
		
		System.out.println("Message from return method:");
		
		return kmHours;
	}

}
