
public class NestedTry {
	public static void main(String[] args) {

		try {
			int array[] = new int[3];
			array[0] = Integer.parseInt(args[0]);
			array[1] = Integer.parseInt(args[1]);
			array[2] = Integer.parseInt(args[2]);

			try {
				for (int i = 0; i <= array.length; i++) {
					System.out.println(args[i]);
				}
			}

			catch (ArrayIndexOutOfBoundsException ie) {
				System.out.println(ie);
			}

		}

		catch (NumberFormatException e) {
			System.out.println(e);

		} finally {
			System.out.println("executed finally block");
		}

	}

}
