
public class RecursionFactorial {

	static int counter = 1;

	public static void main(String[] args) {

		/// System.out.println("The factorial of 5 is " + factorial(5));

		System.out.println(countNumbers(20));
	}

	private static int countNumbers(int i) {
		// TODO Auto-generated method stub
		if (i == 1) {
			return 1;
		} else {
			System.out.println("Printing number :: " + counter++);
			i--;
			return countNumbers(i) + 1;
		}
	}

	private static int factorial(int i) {
		// TODO Auto-generated method stub
		if (i == 1) {
			return 1;
		} else {
			return i * factorial(i - 1);
		}

	}

}
