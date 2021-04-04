package day7_controlFlowStatements;

public class WaterMelons {

	public static void main(String[] args) {
		
		int numbersOfWaterMelons;
		boolean lotsOfWaterMelons;
		lotsOfWaterMelons = false;
		
		numbersOfWaterMelons= 356;
		
		if(numbersOfWaterMelons>=300) {
			System.out.println("I have more than 300 watermelons.");
			lotsOfWaterMelons=true;
		}
		if(lotsOfWaterMelons) {			
			System.out.println("Good job.");
		}
		if(lotsOfWaterMelons == false) {
			System.out.println("I need more watermelons.");
		}
		if (!lotsOfWaterMelons==false) {
			System.out.println("You can share so many watermelons with your team.");
		}
		boolean share= true;
		if (share) {
			System.out.println("It would be great!");
			share=false;
		}
		if (!share) {
			System.out.println("If you don't want to share them, Afiyet olsun!");
		}
		

	}

}
