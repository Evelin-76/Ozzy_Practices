package Label1;

public class Q6 {

	public static void main(String[] args) {

		cigarPArty(42, 1);

	}

	public static void cigarPArty(int cigars, int weekendSatAndSun) {

		boolean weekend = true;
		boolean successful = true;
		int sat = 1, sun = 2;

		System.out.print("cigarParty(" + cigars + " cigarretes ");

		if (cigars >= 40) {

			if (weekendSatAndSun == 2) {

				System.out
						.print(", Is weekend today? " + weekend + ")--> Are you enjoing " + "the party? " + successful);

			} else {

				System.out.print(
						", Is weekend today? " + !weekend + ")--> Are you enjoning " + "the party? " + successful);

			}
			System.out.println("," + !weekend + ")-->" + successful);

		} else if (cigars < 40) {

			if (weekendSatAndSun == 2) {

				System.out.print(
						", Is weekend today? " + weekend + ")--> Are you enjoing " + "the party? " + !successful);

			} else {

				System.out.print(
						", Is weekend today? " + !weekend + ")-->" + " Are you enjoing the party? " + !successful);

			}
		}

	}
}
