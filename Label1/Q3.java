package Label1;

public class Q3 {

	public static void main(String[] args) {

		specialNumber(34);

	}

	public static void specialNumber(int specialEleven) {

		boolean isMultiple11 = true;

		System.out.print("specialEleven(" + specialEleven + ")-->");

		int multiple11 = specialEleven;
		int multiple11PlusOne = specialEleven - 1;

		if (specialEleven % 11 == 0 || multiple11PlusOne % 11 == 0) {

			System.out.println(isMultiple11);

		} else {

			System.out.println(!isMultiple11);
		}

	}

}
