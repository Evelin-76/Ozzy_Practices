package Day4_aritmeticOperations;

public class wages {

	public static void main(String[] args) {
		
		double regularWage;
		double basePay =12.5;
		double regularHours= 40;
		double overTimeWages;
		double overTimePay= 37.5;
		double overTimeHours=15;
		double totalWage;
		
		regularWage=basePay*regularHours;
		overTimeWages=overTimePay*overTimeHours;

		totalWage=regularWage+overTimeWages;
		
		System.out.println("Wages for this weel are $ "+ totalWage);
	}

}
