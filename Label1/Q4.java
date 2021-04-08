package Label1;

public class Q4 {

	public static void main(String[] args) {

		deerPlayGrades(90);

	}

	public static void deerPlayGrades(int deerPlay) {

		boolean isSummer = true;

		System.out.print("deerPlay(" + deerPlay + ", is summer time? ");

		if (deerPlay > 90 && deerPlay <= 100) {

			System.out.print(isSummer + ");-> Can deers go out and play? ");
		} else {

			System.out.print(!isSummer + ");-> Can deers go out and play? ");
		}
		if (deerPlay >= 60 && deerPlay <= 90) {
			
			
			System.out.print(!isSummer);
		}else {
			
			System.out.print(isSummer);
		}

		

	}

}
