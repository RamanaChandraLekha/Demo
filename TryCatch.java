
public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int var = 5;
			int quotient = var / 0;
			System.out.println(quotient);
		} catch (ArithmeticException ae) {
			System.out.println("The exception is" + ae);

			System.out.println("Exception is handled");

		}

	}
}